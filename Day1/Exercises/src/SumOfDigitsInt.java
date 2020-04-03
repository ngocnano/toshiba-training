import java.util.Scanner;

public class SumOfDigitsInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int input,sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to input ");
        input=scanner.nextInt();
        while(input>=10) {
        	sum= sum +input % 10;
        	input=input/10;
        }
        sum+=input;
        System.out.println("The sum is "+sum);
	}

}
