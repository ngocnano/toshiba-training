import java.util.Scanner;

public class TestPalindromicWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter input : ");
			String input    = scanner.next();
			input = input.toUpperCase();
			char arr[]      = input.toCharArray();
			int last        = input.length() - 1;
			int fist        = 0;
			boolean checker = true;
			
			while (true) 
			{
				if (arr[fist] == arr[last]) 
				{
					fist++;
					last--;
				}
				else 
				{
					checker = false;
					break;
				}
				
				if (fist > last) break;
			}
			
			if (checker == true) 
			{
				System.out.println("is a palindrome");
			}
			else
			{
				System.out.println("is not palindrome");
			}
			scanner.close();
	}

}
