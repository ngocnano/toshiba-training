import java.util.Scanner;

public class CheckHexStr {

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
			if ((arr[temp] < 48) || (arr[temp] > 70)) 
			{
				check = false;
				break;
			}
			if ((arr[temp] >= 58) && (arr[temp] <= 64)) 
			{
				check = false;
				break;
			}
			
		}
		
		if (check == true) 
		{
			System.out.println("is a hex string");
		}
		else
		{
			System.out.println("is NOT a hex string");
		}
		scanner.close();

	}

}
