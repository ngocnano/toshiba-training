import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a binary string: ");
		String input  = scanner.next();
		boolean check = true;
		int result    = 0;
		char arr[]    = input.toCharArray();
		
		for (int temp = 0; temp < arr.length; temp++) 
		{
			if ((arr[temp] != 48) && (arr[temp] != 49)) 
			{
				check = false;
				break;
			}
		}
		
		if (check == false) 
		{
			System.out.println("error: invalid binary string: " + input);
		}
		else 
		{
			double decimal = 0.0;
			double count   = 0.0;
			for (int temp = arr.length-1; temp >= 0; temp--) 
			{   
				if (arr[temp] == 49) 
				{
					decimal += Math.pow(2.0, count);
				}
				count++;
			}
			result = (int) decimal;
			System.out.println("The equivalent decimal number for binary is " + result);
		}
		scanner.close();

	}

}
