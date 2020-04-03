import java.util.Scanner;

public class Add2Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int number1,number2;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first integer ");
       number1=sc.nextInt();
       System.out.println("Enter second integer ");
       number2=sc.nextInt();
       System.out.println("Sum = "+ (number1+number2));
       sc.close();
	}

}
