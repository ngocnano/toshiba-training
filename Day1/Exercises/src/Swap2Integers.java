import java.util.Scanner;

public class Swap2Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int number1,number2;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter first integer");
       number1=scanner.nextInt();
       System.out.println("Enter second integer");
       number2=scanner.nextInt();
       int temp=number1;
       number1=number2;
       number2=temp;
       System.out.println("After swap, first integer is "+ number1 +" second integer is "+number2);
       scanner.close();
	}

}
