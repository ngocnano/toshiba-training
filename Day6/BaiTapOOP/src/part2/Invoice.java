package part2;

public class Invoice {
	private int ID;
	private Customer customer;
	private double amount;
	
	public Invoice(int ID, Customer customer, double amount) {
		super();
		this.ID = ID;
		this.customer = customer;
		this.amount = amount;
	}
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getID() {
		return ID;
	}

	public String getCustomerName() 
	{
		return customer.getName();
	}

	public double getAmountAfterDiscount() 
	{
		return amount - customer.getDiscount();
	}
	@Override
	public String toString() {
		return "Invoice [ID=" + ID + ", customer=" + customer + ", amount=" + amount + "]";
	}
	
	
}
