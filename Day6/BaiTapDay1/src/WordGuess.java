import java.util.Scanner;

public class WordGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input    = "testing";
		String keyString = new String();
		char keyChar;
		char inputArr[] = input.toCharArray();
		char output[]   = new char[inputArr.length];
		int count       = 0;
		int check       = 0;
		
		for (int i = 0; i < output.length; i++) 
		{
			output[i] = '_';
		}
		
		while (true) 
		{
			System.out.println("Key in one character or your guess word: ");
			keyString = scanner.next();
			count++;
			
			if(keyString.length() == 1) 
			{
				keyChar = keyString.charAt(0);
			    for (int i = 0; i < inputArr.length; i++) 
			    {
				   if (inputArr[i] == keyChar) 
				   {
					   output[i] = keyChar;
					   check++;
				   }
			    }
			
			    System.out.println("Trial " + count);
			    
			    for (char i : output)    
			    {
			    	System.out.print(i);
			    }
			    
			    System.out.println();
			    
			    if (check == (inputArr.length - 1)) 
			    {
				    break;
			    }
			}
			else 
			{
				if (input.equals(keyString) == true) 
				{
					break;
				}
				else 
				{
					System.out.println(" you guessed wrong ");
				}
			}
		}
		
		System.out.println("Key in one character or your guess word:" + input);
		System.out.println("Congratulation! \n" + "You got in " + count + "trials");
		scanner.close();

	}

}
