package part2;

public class Customer {
	
	private int ID;
	private String name;
	private int discount;
	private char gender;
	
	public Customer(int ID, String name, int discount) {
		super();
		this.ID = ID;
		this.name = name;
		this.discount = discount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", name=" + name + "]";
	}
	
	

}
