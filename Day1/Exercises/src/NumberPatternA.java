import java.util.Scanner;

public class NumberPatternA {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int size;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter to size: ");
			size = scanner.nextInt();
			
			for(int row = 1; row <= size; row++) 
			{
				for(int col = 1; col <= row; col++) 
				{
					System.out.print(col + " ");
				}
				System.out.println();
			}
			scanner.close();
	}

}
