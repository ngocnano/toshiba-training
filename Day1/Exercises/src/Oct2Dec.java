import java.util.Scanner;

public class Oct2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a octal string: ");
			String input  = scanner.next();
			boolean check = true;
			int result    = 0;
			char arr[]    = input.toUpperCase().toCharArray();
			
			for (int temp = 0; temp < arr.length; temp++) 
			{
				if ((arr[temp] < 48) || (arr[temp] > 56)) 
				{
					check = false;
					break;
				}
				
			}
			
			if (check == false) 
			{
				System.out.println("error: invalid Octal string: " + input);
			}
			else 
			{   
				double otc = 0.0;
				double count   = 0.0;
				for (int temp = arr.length-1; temp >= 0; temp--) 
				{   
						double value = (double) arr[temp];
						value = value - 48.0;
						otc += value * Math.pow(8.0, count);
			            count++;
				}
				result = (int) otc;
				System.out.println("The equivalent decimal number for Octal is " + result);
			}
			scanner.close();
	}

}
