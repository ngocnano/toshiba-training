import java.util.Scanner;

public class PerfectNumberList {
	
	public static boolean isPerfect(int aPosInt) 
	{
		int sum = 0;
	    for(int i = 1; i <= aPosInt / 2; i++)
	    {
	        if(aPosInt % i == 0) 
	        {
	            sum += i ;
	         }
	        
	    } 
	    if(sum == aPosInt) 
	    { 
	    	return true; 
	    }
	    return false;
	   
	}

	public static boolean isDeficient(int aPosInt) 
	{
		int sum = 0;
		for (int i = 1; i <= aPosInt / 2; i++) 
		{
			if (aPosInt % i == 0) 
			{
				sum += i;
			}
		}
		
		if (sum < aPosInt) 
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
		
		System.out.print("Enter the upper bound: ");
		int upper = scanner.nextInt();
		int count = 0;
		
		System.out.println("These numbers are perfect:");
		for(int i = 1; i <= upper; i++) 
		{
			if (isPerfect(i)) 
			{
				System.out.print(i + " ");
				count++;
			}
		}
		
		double rate =  ((double)count / upper) * 100;
		
		System.out.println("[" + count + "perfect numbers found (" + rate + "%)]");
		
		System.out.println("These numbers are neither deficient nor perfect: ");
		count = 0;
		for(int i = 1; i <= upper; i++) 
		{
			if (isDeficient(i) == false && isPerfect(i) == false) 
			{
				System.out.print(i + " ");
				count++;
			}
		}
		
        rate =  ((double)count / upper) * 100;
		System.out.println();
		System.out.println("[" + count + "numbers found (" + rate + "%)]");
		scanner.close();
	}

}
