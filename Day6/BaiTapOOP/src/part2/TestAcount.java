package part2;

public class TestAcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(5, "Ngoc", 500);
        Acount acount = new Acount(1, customer);
        System.out.println(acount);
        acount = acount.deposit(5000);
        acount = acount.withdraw(2000);
        System.out.println(acount);
	}

}
