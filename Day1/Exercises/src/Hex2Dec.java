import java.util.Scanner;

public class Hex2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexa string: ");
		String input  = scanner.next();
		boolean check = true;
		int result    = 0;
		char arr[]    = input.toUpperCase().toCharArray();
		
		for (int temp = 0; temp < arr.length; temp++) 
		{
			if ((arr[temp] < 48) || (arr[temp] > 70)) 
			{
				check = false;
				break;
			}
			else if ((arr[temp] >= 58) && (arr[temp] <= 64)) 
			{
				check = false;
				break;
			}
		}
		
		if (check == false) 
		{
			System.out.println("error: invalid hexadecimal string: " + input);
		}
		else 
		{   
			double hexa = 0.0;
			double count   = 0.0;
			for (int temp = arr.length-1; temp >= 0; temp--) 
			{   
				if (arr[temp] > 64) 
				{
					double value = (double) arr[temp];
					value = value - 55.0;
					hexa += value * Math.pow(16.0, count);
				}
				else 
				{   
					double value = (double) arr[temp];
					value = value - 48.0;
					hexa += value * Math.pow(16.0, count);
				}
				count++;
			}
			result = (int) hexa;
			System.out.println("The equivalent decimal number for hexadecimal is " + result);
		}
		scanner.close();

	}

}
