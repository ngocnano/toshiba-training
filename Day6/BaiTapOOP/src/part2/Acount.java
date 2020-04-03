package part2;

public class Acount {
	
	private int id;
	private Customer customer;
	private double balance = 0.0;
	
	public Acount(int id, Customer customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	
	public Acount(int id, Customer customer) {
		super();
		this.id = id;
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}
 
	public String toString() 
	{
		return (customer.getName() + " (" + id + ") balance " + "$" + balance);	
	}
	
	public String getCustomerName() 
	{
		return customer.getName();
	}
	
	public Acount deposit(double amount) 
	{
		balance = balance + amount;
		return this;
	}
	
	public Acount withdraw(double amount)
	{
		if(balance >= amount) 
		{
			balance -= amount;
		}
		else 
		{
			System.out.println("amount withdrawn exceeds the curent balance ");
		}
		return this;
	}
	
}
