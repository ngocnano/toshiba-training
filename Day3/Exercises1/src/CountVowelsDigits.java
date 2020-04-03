import java.util.Scanner;

public class CountVowelsDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner   = new Scanner(System.in);
		System.out.print("Enter a String: ");
        String input      = scanner.next();
        int numberOfVowel = 0;
        int numberOfDigit = 0;
        float rateVowel   = 0.0f;
        float rateDigit   = 0.0f;
        char inputArray[] = input.toCharArray();
        char vowelArray[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        
        for (int charID = 0; charID < input.length(); charID++) 
        {
         	for (int i = 0; i < vowelArray.length; i++) 
         	{
         		if (inputArray[charID] == vowelArray[i]) 
         		{
         			numberOfVowel++;
         			break;
         		}
         	}
         	
         	for (int i = 48; i <= 57; i++) 
         	{
         		if (inputArray[charID] == i) 
         		{
         			numberOfDigit++;
         			break;
         		}
         	}
        }
        rateDigit = ( (float) numberOfDigit / inputArray.length) * 100;
        rateVowel = ( (float) numberOfVowel / inputArray.length) * 100;
        
        System.out.print("Number of vowels: " + numberOfVowel);
        System.out.printf(" ( %.2f )", rateVowel);
        System.out.print("Number of digit: " + numberOfDigit);
        System.out.printf(" ( %.2f )", rateDigit);
        scanner.close();
	}

}
