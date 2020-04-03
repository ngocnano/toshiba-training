import java.util.Scanner;


public class SalesTaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price, actualPrice, salesTax;
		double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
		price= scanner.nextDouble();
		if(price == -1) break;
		actualPrice= (price/107.0) * 100;
		salesTax = price- actualPrice;
		System.out.println("Actua price is " + actualPrice);
		System.out.println("Sales tax is "+salesTax);
		totalPrice+=price;
		totalActualPrice+=actualPrice;
		totalSalesTax+=salesTax;}
		System.out.println("total price is "+ totalPrice);
		System.out.println("total actual price is "+totalActualPrice);
		System.out.println("total sales tax is "+ totalSalesTax);
		scanner.close();
	}
		
		

}
