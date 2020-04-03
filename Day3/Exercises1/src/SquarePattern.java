import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int size        = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter to size of square: ");
        size = scanner.nextInt();
        
        for (int row = 0; row < size; row++) 
        {
        	for (int col = 0; col < size; col++) 
        	{
        		System.out.print("# ");
        	}
        	System.out.println();
        }
        
        scanner.close();
	}

}
