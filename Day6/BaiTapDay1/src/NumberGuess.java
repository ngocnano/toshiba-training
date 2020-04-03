import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		Random rd        = new Random();
		int secretNumber = (int)(Math.random()*100);
		int tryInt       = 0;
		int count        = 0;
		System.out.println("Key in your guess: " + secretNumber);
		
		while(true) 
		{
			int random = rd.nextInt(2);
			
			if (random == 1) 
			{
				System.out.println("Try higher ");
				tryInt = scanner.nextInt();
				if (tryInt > secretNumber)
				{
					count++;
				}
				else 
				{
					break;
				}
			}
			else 
			{
				System.out.println("Try lower ");
				tryInt = scanner.nextInt();
				if (tryInt < secretNumber)
				{
					count++;
				}
				else 
				{
					break;
				}
			}
		}
		
		System.out.println("You got it in " + count + " trials!");
		scanner.close();
	}


}
