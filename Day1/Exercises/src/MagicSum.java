import java.util.Scanner;

public class MagicSum {
	public static boolean hasEight(int number) 
	{
		int numbers = number;
		while(numbers >= 10) 
		{
			int temp = numbers % 10;
			if (temp == 8) return true;
			numbers = numbers / 10;
		}
		if (number == 8) return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum         = 0;
        
        while(true) 
        {
        	System.out.println("Enter a positive integer (or -1 to end): ");
        	number = scanner.nextInt();
        	if (hasEight(number) == true) 
        	{
        		sum +=number;
        	}
        	if(number == -1) break;
        }
        System.out.println("The magic sum is: " + sum);
        scanner.close();
	}

}
