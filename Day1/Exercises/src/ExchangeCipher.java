import java.util.Scanner;

public class ExchangeCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a plaintext string: ");
		String input    = scanner.next();
		
		input = input.toUpperCase();
		
		char inputArray[] = input.toCharArray();
		
		for (int temp = 0; temp < inputArray.length; temp++) 
		{
			int asii = inputArray[temp];
			
			if (inputArray[temp] <= 77) 
			{
				asii             = 90 - (asii - 65);
				inputArray[temp] = (char) asii;
			}
			else
			{
				asii    = 65 + (90 - asii);
				inputArray[temp] = (char) asii;
			}
		}
		
		System.out.println(inputArray);
		scanner.close();

	}

}
