import java.util.Scanner;

public class PerfectPrimeFactorList {
	
	public static boolean isPrime(int n) 
	{
		int count = 0;
		for(int i = 1; i * i <= n; i++) 
		{
			if(n % i == 0) 
			{
				count++;
				if (count == 2) 
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isProductOfPrimeFactors(int aPosInt) 
	{
		int calculus = 1;
		for (int i = 1; i <= aPosInt / 2; i++) 
		{
			if (aPosInt % i == 0) 
			{
				if(isPrime(i)) 
				{
				calculus *= i;
				}
			}
		}
		
		if (calculus == aPosInt) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the upper bound: ");
		int upper = scanner.nextInt();
		int count = 0;
		for (int i = 1; i <= upper; i++) 
		{
			if (isProductOfPrimeFactors(i)) 
			{
				System.out.println(i);
				count++;
			}
		}
        double rate =  ((double)count / upper) * 100;
		
		System.out.println("[" + count + "numbers found (" + rate + "%)]");
		scanner.close();


	}

}
