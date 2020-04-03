import java.util.Scanner;

public class NumberPatternC {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter to size: ");
		size = scanner.nextInt();
		
		for(int row = 1; row <= size; row++) 
		{
			for(int col = 1; col <= size; col++) 
			{
				if (col > (size - row)) 
				{
					System.out.print((size - (col - 1)) + " ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
