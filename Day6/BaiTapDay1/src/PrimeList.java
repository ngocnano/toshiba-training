import java.util.Scanner;

public class PrimeList {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the upper bound: ");
		int upper = scanner.nextInt();
		int count = 0;
		for (int i = 1; i <= upper; i++) 
		{
			if (isPrime(i)) 
			{
				System.out.println(i);
				count++;
			}
		}
        double rate =  ((double)count / upper) * 100;
		
		System.out.println("[" + count + "primes found (" + rate + "%)]");
		scanner.close();
	}

}
