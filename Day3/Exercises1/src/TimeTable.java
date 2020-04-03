import java.util.Scanner;

public class TimeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int size        = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter to size: ");
        size = scanner.nextInt();
        
        for (int row = 0; row <= (size + 1); row++) 
        {   
        	if (row == 0) 
        	{
        		System.out.print(" * |");
        	}
        	else if (row > 1) 
        	{
				System.out.printf("%2d",(row - 1));
				System.out.print(" |");
			}
        	else 
        	{
				System.out.print("----");
			}
        	
        	for (int col = 1; col <= size; col++) 
        	{
        		if (row == 0) 
        		{
        			System.out.printf("%4d", col);
        		}
        		else if (row == 1) 
        		{
        			System.out.print("----");
        		}
        		else 
        		{
        			System.out.printf("%4d",(col * (row - 1)));
        		}
        	}
        	System.out.println();
        }
        scanner.close();
	}

}
