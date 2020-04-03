import java.util.Scanner;

public class OddEvenTest {
	public static boolean isOdd(int number) 
	{
		if ((number % 2) == 0) 
		{
			return false;
		}
		else 
		{
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		if (isOdd(number) == true) 
		{
			System.out.println(number + " is an odd number");
		}
		else
		{
			System.out.println(number + " is an even number");
		}
		scanner.close();
	}

}
