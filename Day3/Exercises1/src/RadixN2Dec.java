import java.util.Scanner;

public class RadixN2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the radix: ");
		 int radix =scanner.nextInt();
	     System.out.print("Enter the string: ");
		 String input  = scanner.next();
		 int result    = 0;
		 char arr[]    = input.toUpperCase().toCharArray();
  		 int arrInt[]  = new int[arr.length];
  			
  		 for (int temp = 0; temp < arr.length; temp++) 
  		 {
  			if (arr[temp] > 64) 
  			{
  				arrInt[temp] = arr[temp] - 55;
  			}
  			else 
  			{
  				arrInt[temp] = arr[temp] - 48;
			}
  		 }
  			
  		   double decimal = 0.0;
		   double count   = 0.0;
		   for (int temp = (arr.length - 1); temp >= 0; temp--) 
		   {   
				double value = (double) arrInt[temp];
				decimal += value * Math.pow((double) radix, count);
		        count++;
		    }
			result = (int) decimal;
			System.out.println("The equivalent decimal number for " + radix + " is " +result);
  			scanner.close();
	}

}
