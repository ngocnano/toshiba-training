import java.util.Scanner;

public class GradesHistogram {

	public static int []gardenArr = new int [10];
	
	public static void reads(int n) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of gardens ");
		n = scanner.nextInt();

		for(int i = 0; i < n; i++) 
		{   
			int garden = 0;
			System.out.print("Enter the number of gardens " + (i+1) + " :");
			garden = scanner.nextInt();
			
			for(int j = 0; j < 10; j++) 
			{
				int temp = 10 * j;
				if ((garden >= temp) && (garden <= (temp + 9))) 
				{
					gardenArr[j] ++;
				} 
				else 
				{
					if (n == 100) 
					{
						gardenArr[9]++;
					}
				}
			}
		}
		scanner.close();
	}
	
	public static void printf() 
	{
		for (int i = 0; i < 10; i++) 
		{
			int temp = 10 * i;
			if(i != 9) 
			{  
				System.out.print(temp + " - " + (temp + 9) + " :");
			}
			else 
			{
				System.out.print("90 - 100 :");
			}
			
			for (int j = 0; j < gardenArr[i]; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printfVertical(int numberOfGrade) 
	{
		int maxNumberOfGarden = 0;
		
		for (int i = 0; i < gardenArr.length; i++) 
		{
			if (gardenArr[i] >= maxNumberOfGarden) 
			{
				maxNumberOfGarden = gardenArr[i];
			}
		}
		
		int temp = maxNumberOfGarden;
	    for(int i = 0; i < maxNumberOfGarden; i++) 
	    {
	    	for (int j = 0; j < 10; j++) 
	    	{
	    		if (gardenArr[j] >= temp) 
	    		{
	    			System.out.print("*      ");
	    		}
	    		else 
	    		{
					System.out.print("       ");
				}	
	    	}
	    	temp--;
	    	System.out.println();
	    	
	    }
	    
	    for (int i = 0; i < 9; i++) 
	    {
	    	int k = i * 10;
	    	System.out.print(k + "-" + (k + 9) + "  ");
	    }
	    System.out.print("90-100");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numberOfGrade = 0;
        reads(numberOfGrade);
        printf();
        printfVertical(numberOfGrade);
	}

}
