import java.util.Scanner;

public class SumProductMinMax3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number1,number2,number3,sum,product,min,max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer");
        number1=sc.nextInt();
        System.out.print("Enter 2nd integer");
        number2=sc.nextInt();
        System.out.print("Enter 3rd integer");
        number3=sc.nextInt();
        sum=number1+number2+number3;
        min=max=number1;
        if(number2>max) max=number2; 
        if(number3>max) max=number3;
        if(number2<min) min=number2;
        if(number3<min) min=number3;
        product=number1*number2*number3;
        System.out.println("The sum is "+sum);
        System.out.println("The product is "+product);
        System.out.println("The min is "+min);
        System.out.println("The max is "+ max);
        sc.close();
	}

}
