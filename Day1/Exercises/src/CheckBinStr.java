import java.util.Scanner;

public class CheckBinStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a binary string: ");
		String input  = scanner.next();
		input = input.toUpperCase();
		boolean check = true;
		char arr[]    = input.toCharArray();
		
		for (int temp = 0; temp < arr.length; temp++) 
		{
			if ((arr[temp] != 48) && (arr[temp] != 49)) 
			{
				check = false;
				break;
			}
		}
		
		if (check == true) 
		{
			System.out.println("is a binary string");
		}
		else
		{
			System.out.println("is NOT a binary string");
		}
		scanner.close();
	}

}
