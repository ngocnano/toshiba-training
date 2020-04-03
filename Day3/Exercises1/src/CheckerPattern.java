import java.util.Scanner;

public class CheckerPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size        = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter to size of square: ");
        size = scanner.nextInt();
        
        for (int row = 1; row <= size; row++) 
        {
        	if (row % 2 == 0) 
        	{
        		System.out.print(" ");
        	} 
        	
        	for (int col = 1; col <= size; col++) 
        	{
        		System.out.print("# ");
        	}
        	
        	System.out.println();
        }
        
        scanner.close();
	}

}
