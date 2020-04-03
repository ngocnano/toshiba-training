import java.util.Scanner;

public class TriangularPatternB {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter to size: ");
		size = scanner.nextInt();
		
		for(int row = 1; row <= size; row++) 
		{
			for(int col = size; col >= row; col--) 
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
