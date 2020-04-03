package com.control;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Checked;
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
public class ControllerShoping {

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
	
	@RequestMapping(value = "/shopping/{idCustomer}/",method = RequestMethod.GET)
	public String shoping(@PathVariable("idCustomer") int idCustomer, Model model) 
	{ 
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = format.format(new Date());
		List<Order> listOrder = this.orderService.listOrder();
		List<OrderDetail> listOrderDetail = this.orderDetailService.listOrderDetail();
		List<OrderTotal> listOrderTotal = new ArrayList<OrderTotal>();

		for (int i = 0; i < listOrder.size(); i++) {
			if (listOrder.get(i).getIdCustomer() == idCustomer)
			{
			   listOrderTotal.add(new OrderTotal(listOrder.get(i), listOrderDetail.get(i)));
			}
		}
		model.addAttribute("listOrderTotal", listOrderTotal);
		model.addAttribute("listCustomer",this.customerService.listCustomer());
		model.addAttribute("customer", new Customer());
		model.addAttribute("customerName", this.customerService.getCustomer(idCustomer).getCustomerName());
		model.addAttribute("orderTotal", new OrderTotal(dateString, idCustomer));
		model.addAttribute("listProduct", this.productService.listProduct());
		model.addAttribute("product", new Product());
		model.addAttribute("listProduct", this.productService.listProduct());
		model.addAttribute("listCategory",this.categoryService.listCategory());
		model.addAttribute("checked", new Checked());
		return "Shopping";
	}
	
	@RequestMapping(value = "/addShopping/",method = RequestMethod.POST)
	public String addShopping(@Valid @ModelAttribute("orderTotal") OrderTotal p,
			BindingResult bindingResult, Model model) 
	{ 
	    Product product = this.productService.getProduct(p.getIdProduct());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = format.format(new Date());
		Order order = new Order(null, dateString, p.getIdCustomer(), product.getPrice() * p.getQuantity());
		this.orderService.addOrder(order);
		List<Order> list = this.orderService.listOrder();
		OrderDetail orderDetail = new OrderDetail(list.get(list.size() - 1).getIdOrder(), p.getIdProduct(), p.getQuantity());
		this.orderDetailService.addOrderDetail(orderDetail);
		product.setQuantity(product.getQuantity() - p.getQuantity());
		this.productService.updateProduct(product);
		return "redirect:/shopping/"+ p.getIdCustomer() + "/";
	}
	
	@RequestMapping("/deleteShopping/{idOrder}/")
	public String deleteOrder(@PathVariable("idOrder") int idOrder) {
        int idCustomer = this.orderService.getOrder(idOrder).getIdCustomer();
		Product product = this.productService.getProduct(this.orderDetailService.getOrderDetail(idOrder).getIdProduct());
		product.setQuantity(product.getQuantity() + this.orderDetailService.getOrderDetail(idOrder).getQuantity());
		this.productService.updateProduct(product);
		this.orderService.deleteOrder(idOrder);
		this.orderDetailService.deleteOrderDetail(idOrder);
		return "redirect:/shopping/"+ idCustomer + "/";
	}


}
