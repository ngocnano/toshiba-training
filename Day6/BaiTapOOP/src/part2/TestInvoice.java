package part2;

public class TestInvoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(5, "Ngoc", 500);
        Invoice in = new Invoice(1, customer, 2000);
        System.out.println(in);
        System.out.println(in.getCustomerName());
        System.out.println(in.getAmountAfterDiscount());
        in.setAmount(3000);
        in.getCustomer().setDiscount(200);
        System.out.println(in.getAmountAfterDiscount());
	}

}
