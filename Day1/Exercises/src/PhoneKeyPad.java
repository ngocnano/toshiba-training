import java.util.Scanner;

public class PhoneKeyPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner   = new Scanner(System.in);
		System.out.println("Enter input: ");
		int count         = 0;
		String input      = scanner.next();
		input     = input.toUpperCase();
		char inputChar[]  = input.toCharArray();
		
		while(true) 
		{
			if (inputChar[count] == 'A') 
			{
				count += 1;
				if (inputChar[count] == 'B') 
				{
					count += 1;
					if(inputChar[count] == 'C') 
					{
						count += 1;
						System.out.println("2");
					}
				}
			}
			else if (inputChar[count] == 'D') 
			{
				count += 1;
				if (inputChar[count] == 'E') 
				{
					count += 1;
					if(inputChar[count] == 'F') 
					{
						count += 1;
						System.out.println("3");
					}
				}
			}
			else if (inputChar[count] == 'G') 
			{
				count += 1;
				if (inputChar[count] == 'H') 
				{
					count += 1;
					if(inputChar[count] == 'I') 
					{
						count += 1;
						System.out.println("4");
					}
				}
			}
			else if (inputChar[count] == 'J') 
			{
				count += 1;
				if (inputChar[count] == 'K') 
				{
					count += 1;
					if(inputChar[count] == 'L') 
					{
						count += 1;
						System.out.println("5");
					}
				}
			}
			else if (inputChar[count] == 'M') 
			{
				count += 1;
				if (inputChar[count] == 'N') 
				{
					count += 1;
					if(inputChar[count] == 'O') 
					{
						count += 1;
						System.out.println("6");
					}
				}
			}
			else if (inputChar[count] == 'P') 
			{
				count += 1;
				if (inputChar[count] == 'Q') 
				{
					count += 1;
					if(inputChar[count] == 'R') 
					{
						count += 1;
						if(inputChar[count]== 'S') 
						{
							System.out.println("7");
							count++;
						}
					}
				}
			}
			else if (inputChar[count] == 'W') 
			{
				count += 1;
				if (inputChar[count] == 'X') 
				{
					count += 1;
					if(inputChar[count] == 'Y') 
					{
						count += 1;
						if(inputChar[count]== 'Z') 
						{
							System.out.println("9");
							count++;
						}
					}
				}
			}
			else if (inputChar[count] == 'T') 
			{
				count += 1;
				if (inputChar[count] == 'U') 
				{
					count += 1;
					if(inputChar[count] == 'V') 
					{
						count += 1;
						System.out.println("8");
					}
				}
			}
			else 
			{
				count++;
			}
			if (count == inputChar.length) 
			{
				break;
			}
			
		}
		scanner.close();
		

	}

}
