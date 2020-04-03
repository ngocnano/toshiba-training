package part2;

public class Book {
	private String name;
	private Author[] author;
	private double price;
	private int qty;
	
	public Book(String name, Author[] author, double price, int qty) 
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public Book(String name, Author[] author, double price) 
	{
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthor() {
		return author;
	}
	
	public String getAuthorName() 
	{
		String result = new String();
		for (int i = 0; i < author.length; i++) 
		{
			result = result.concat(author[i].getName() + ",");	
		}
		return result;
	}

	@Override
	public String toString() {
		String result = new String();
		for (int i = 0; i < author.length; i++) 
		{
			result = result.concat("Book [name=" + name + ", author=" + author[i].getName() + ", price=" + price + ", qty=" + qty + "]");	
		}
		return result;
	}

}
