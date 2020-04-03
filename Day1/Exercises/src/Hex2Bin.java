import java.util.Scanner;

public class Hex2Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String[] hexBits = {"0000", "0001", "0010", "0011",
        		            "0100", "0101", "0110", "0111",
        		            "1000", "1001", "1010", "1011",
        		            "1100", "1101", "1110", "1111"};
        
        System.out.print("Enter a Hexadecimal string: ");
        String input = scanner.next();
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
 		System.out.print("The equivalent binary for hexadecimal is: ");
 		
 		for (int temp = 0; temp < arr.length; temp++) 
 		{
 			System.out.print(hexBits[arrInt[temp]]);
 			System.out.print(" ");
 			
 		}
 		scanner.close();
	}

}
