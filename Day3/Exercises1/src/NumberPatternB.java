import java.util.Scanner;

public class NumberPatternB {
	
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
				if (col < row) 
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print((col - (row - 1)) + " ");
				}
			}
			System.out.println();
		}
		scanner.close();
}
}
