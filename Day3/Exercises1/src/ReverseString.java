import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter to String ");
        String reverse  = scanner.next();
        String result   = new String();
        
        for (int charIdx = reverse.length() - 1; charIdx >= 0; charIdx--) 
        {
        	char temp = reverse.charAt(charIdx);
        	result    = result.concat(Character.toString(temp));
        }
        
        System.out.println("The reverse of the String: " + reverse + " -> " + result);
        scanner.close();
	}
	
}
