package com.control;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Category;
import com.model.Customer;
import com.model.Order;
import com.model.OrderDetail;
import com.model.OrderTotal;
import com.model.Product;
import com.service.CategoryService;
import com.service.CustomerService;
import com.service.OrderDetailService;
import com.service.OrderService;
import com.service.ProductService;

import javassist.expr.NewArray;

@Controller
public class ControllerHome {

	private CustomerService customerService;
	private ProductService productService;
	private CategoryService categoryService;
	private OrderService orderService;
	private OrderDetailService orderDetailService;

	@Autowired(required = true)
	@Qualifier(value = "customerService")
	public void setCustomerService(CustomerService cs) {
		this.customerService = cs;
	}

	@Autowired(required = true)
	@Qualifier(value = "productService")
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@Autowired(required = true)
	@Qualifier(value = "categoryService")
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@Autowired(required = true)
	@Qualifier(value = "orderService")
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	@Autowired(required = true)
	@Qualifier(value = "orderDetailService")
	public void setOrderDetailService(OrderDetailService orderDetailService) {
		this.orderDetailService = orderDetailService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listCustomer(Model model) {
		
		model.addAttribute("listCustomer", this.customerService.listCustomer());
		model.addAttribute("customer",new Customer());    
		return "dangnhap";
	    
	}
    
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String dangnhap(@RequestParam("idCustomer") int idCustomer, Model model) 
	{

		if(idCustomer == 1) 
		{
			return "Home";
		}
		else 
		{	
		    return "redirect:/shopping/"+ idCustomer + "/";
		}
	}
	
	@RequestMapping(value = "product/", method = RequestMethod.GET)
	public String product(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("listProduct", this.productService.listProduct());
		model.addAttribute("listCategory", this.categoryService.listCategory());
		return "Product";
	}

	@RequestMapping(value = "/add/", method = RequestMethod.POST)
	public String addProduct(@Valid @ModelAttribute("product") Product p, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("org.springframework.validation.BindingResult.form", bindingResult);
			model.addAttribute("listCategory", this.categoryService.listCategory());
			model.addAttribute("listProduct", this.productService.listProduct());
			return "Product";
		}
		if (p.getIdProduct() == null) {
			// new person, add it
			this.productService.addProduct(p);
		} else {
			// existing person, call update
			this.productService.updateProduct(p);
		}

		return "redirect:/product/";

	}

	@RequestMapping("/product/delete/{idProduct}")
	public String deleteProduct(@PathVariable("idProduct") int idProduct) {

		this.productService.deleteProduct(idProduct);
		return "redirect:/product/";
	}

	@RequestMapping("/edit/{idProduct}")
	public String editProduct(@PathVariable("idProduct") int idProduct, Model model) {
		model.addAttribute("product", this.productService.getProduct(idProduct));
		model.addAttribute("listCategory", this.categoryService.listCategory());
		model.addAttribute("listProduct", this.productService.listProduct());
		return "Product";
	}

	@RequestMapping(value = "category/", method = RequestMethod.GET)
	public String category(Model model) {
		model.addAttribute("category", new Category());
		model.addAttribute("listCategory", this.categoryService.listCategory());
		return "Category";
	}

	@RequestMapping(value = "/addCategory/", method = RequestMethod.POST)
	public String addCategory(@Valid @ModelAttribute("category") Category p, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("org.springframework.validation.BindingResult.form", bindingResult);
			model.addAttribute("listCategory", this.categoryService.listCategory());
			return "Category";
		}
		if (p.getIdCategory() == null) {
			// new person, add it
			this.categoryService.addCategory(p);
		} else {
			// existing person, call update
			this.categoryService.updateCategory(p);
		}

		return "redirect:/category/";

	}

	@RequestMapping("/category/deleteCategory/{idCategory}")
	public String deleteCategory(@PathVariable("idCategory") int idCategory) {

		this.categoryService.deleteCategory(idCategory);
		return "redirect:/category/";
	}

	@RequestMapping("/editCategory/{idCategory}")
	public String editCategory(@PathVariable("idCategory") int idCategory, Model model) {
		model.addAttribute("category", this.categoryService.getCategory(idCategory));
		model.addAttribute("listCategory", this.categoryService.listCategory());
		return "Category";
	}

	@RequestMapping(value = "customer/", method = RequestMethod.GET)
	public String customer(Model model) {
		model.addAttribute("customer", new Customer());
		model.addAttribute("listCustomer", this.customerService.listCustomer());
		return "Customer";
	}

	@RequestMapping(value = "/addCustomer/", method = RequestMethod.POST)
	public String addCustomer(@Valid @ModelAttribute("customer") Customer p, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("org.springframework.validation.BindingResult.form", bindingResult);
			model.addAttribute("listCustomer", this.customerService.listCustomer());
			return "Customer";
		}
		if (p.getIdCustomer() == null) {
			// new person, add it
			this.customerService.addCustomer(p);
		} else {
			// existing person, call update
			this.customerService.updateCustomer(p);
		}

		return "redirect:/customer/";

	}

	@RequestMapping("/customer/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable("id") int id) {

		List<Order> listOrders = this.orderService.listOrder();
		for (int i = 0; i < listOrders.size(); i++) {
			if (listOrders.get(i).getIdCustomer() == id) {
				this.orderDetailService.deleteOrderDetail(listOrders.get(i).getIdOrder());
				this.orderService.deleteOrder(listOrders.get(i).getIdOrder());

			}
		}

		this.customerService.deleteCustomer(id);
		return "redirect:/customer/";
	}

	@RequestMapping("/editCustomer/{id}")
	public String editCustomer(@PathVariable("id") int id, Model model) {
		model.addAttribute("customer", this.customerService.getCustomer(id));
		model.addAttribute("listCustomer", this.customerService.listCustomer());
		return "Customer";
	}

	@RequestMapping(value = "order/", method = RequestMethod.GET)
	public String order(Model model) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = format.format(new Date());
		List<Order> listOrder = this.orderService.listOrder();
		List<OrderDetail> listOrderDetail = this.orderDetailService.listOrderDetail();
		List<OrderTotal> listOrderTotal = new ArrayList<OrderTotal>();

		for (int i = 0; i < listOrder.size(); i++) {
			listOrderTotal.add(new OrderTotal(listOrder.get(i), listOrderDetail.get(i)));
		}
		model.addAttribute("listOrderTotal", listOrderTotal);
		model.addAttribute("orderTotal", new OrderTotal(dateString));
		model.addAttribute("listCustomer", this.customerService.listCustomer());
		model.addAttribute("listProduct", this.productService.listProduct());
		return "Order";
	}

	@RequestMapping(value = "/addOrder/", method = RequestMethod.POST)
	public String addOrder(@Valid @ModelAttribute("orderTotal") OrderTotal p, BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("org.springframework.validation.BindingResult.form", bindingResult);

			List<Order> listOrder = this.orderService.listOrder();
			List<OrderDetail> listOrderDetail = this.orderDetailService.listOrderDetail();
			List<OrderTotal> listOrderTotal = new ArrayList<OrderTotal>();
			for (int i = 0; i < listOrder.size(); i++) {
				listOrderTotal.add(new OrderTotal(listOrder.get(i), listOrderDetail.get(i)));
			}
			model.addAttribute("listOrderTotal", listOrderTotal);
			model.addAttribute("listProduct", this.productService.listProduct());
			model.addAttribute("listCustomer", this.customerService.listCustomer());
			return "Order";

		}
		if (p.getIdOrder() == null) {
			// new person, add it
			Product product = this.productService.getProduct(p.getIdProduct());
			p.setTotalMoney(product.getPrice() * p.getQuantity());
			product.setQuantity(product.getQuantity() - p.getQuantity());
			this.productService.updateProduct(product);
			Order order = new Order(p.getIdOrder(), p.getDate(), p.getIdCustomer(), p.getTotalMoney());
			this.orderService.addOrder(order);
			List<Order> listOrder = this.orderService.listOrder();
			OrderDetail orderDetail = new OrderDetail(listOrder.get(listOrder.size() - 1).getIdOrder(),
					p.getIdProduct(), p.getQuantity());
			this.orderDetailService.addOrderDetail(orderDetail);

		} else {
			// existing person, call update
			Product product = this.productService.getProduct(p.getIdProduct());
			p.setTotalMoney(product.getPrice() * p.getQuantity());
			this.productService.updateProduct(product);
			Order order = new Order(p.getIdOrder(), p.getDate(), p.getIdCustomer(), p.getTotalMoney());
			OrderDetail orderDetail = new OrderDetail(p.getIdOrder(), p.getIdProduct(), p.getQuantity());
			this.orderService.updateOrder(order);
			this.orderDetailService.updateOrderDetail(orderDetail);
		}

		return "redirect:/order/";

	}

	@RequestMapping("/order/deleteOrder/{idOrder}")
	public String deleteOrder(@PathVariable("idOrder") int idOrder) {

		Product product = this.productService.getProduct(this.orderDetailService.getOrderDetail(idOrder).getIdProduct());
		product.setQuantity(product.getQuantity() + this.orderDetailService.getOrderDetail(idOrder).getQuantity());
		this.productService.updateProduct(product);
		this.orderService.deleteOrder(idOrder);
		this.orderDetailService.deleteOrderDetail(idOrder);
		return "redirect:/order/";
	}

	@RequestMapping("/editOrder/{idOrder}")
	public String editOrder(@PathVariable("idOrder") int idOrder, Model model) {
		Order order = this.orderService.getOrder(idOrder);
		OrderDetail orderDetail = this.orderDetailService.getOrderDetail(idOrder);
		OrderTotal orderTotal = new OrderTotal(order, orderDetail);
		model.addAttribute("orderTotal", orderTotal);
		List<Order> listOrder = this.orderService.listOrder();
		List<OrderDetail> listOrderDetail = this.orderDetailService.listOrderDetail();
		List<OrderTotal> listOrderTotal = new ArrayList<OrderTotal>();

		for (int i = 0; i < listOrder.size(); i++) {
			listOrderTotal.add(new OrderTotal(listOrder.get(i), listOrderDetail.get(i)));
		}
		model.addAttribute("listOrderTotal", listOrderTotal);
		model.addAttribute("listProduct", this.productService.listProduct());
		model.addAttribute("listCustomer", this.customerService.listCustomer());
		return "Order";
	}
}
