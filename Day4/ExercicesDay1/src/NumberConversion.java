import java.util.Scanner;

public class NumberConversion {
	public static void toRadix(String in, int inRadix, int outRadix) 
	{
		if((inRadix == 16) && (outRadix == 2)) 
		{
			  String[] hexBits = {"0000", "0001", "0010", "0011",
  		            "0100", "0101", "0110", "0111",
  		            "1000", "1001", "1010", "1011",
  		            "1100", "1101", "1110", "1111"};
			  char arr[]    = in.toUpperCase().toCharArray();
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
		 		System.out.print("in radix 16 is : ");
		 		System.out.println(in);
		 		
		 		for (int temp = 0; temp < arr.length; temp++) 
		 		{
		 			System.out.print(hexBits[arrInt[temp]]);
		 			System.out.print(" ");
		 			
		 		}
		 		System.out.println("in radix 2");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number and radix: ");
        String in = scanner.next();
        System.out.println("Enter the input radix:");
        int inputRadix = scanner.nextInt();
        System.out.println("Enter the output radix:");
        int outputRadix = scanner.nextInt();
        toRadix(in, inputRadix, outputRadix);
        scanner.close();
	}

}
