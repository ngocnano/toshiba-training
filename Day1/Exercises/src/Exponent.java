import java.util.Scanner;

public class Exponent 
{
	public static int exponent(int base, int exp) 
	{   
		if (exp == 0) return 1;
		int result = 1;
		for (int i = 1; i <= exp; i++) 
		{
			result = result * base;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int exp;
        int base;
        System.out.println("Enter the base: ");
        base = scanner.nextInt();
        System.out.println("Enter the exp: ");
        exp  = scanner.nextInt();
        
        System.out.println(base + " raises to the power of " + exp + " is: " +
        		exponent(base, exp));
        scanner.close();
	}

}
