import java.util.Scanner;

public class CaesarCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a plaintext string: ");
        
        String input    =  scanner.next();
        input   = input.toUpperCase();
        char toArray[] = input.toCharArray();
        
        for (int temp = 0; temp < toArray.length; temp++) 
        {
        	int asii = toArray[temp];
        	asii += 3;
        	toArray[temp] = (char) asii;
        }
        
        input = new String(toArray);
        
        System.out.print("The ciphertext string is: ");
        System.out.println(input);
        scanner.close();
	}

}
