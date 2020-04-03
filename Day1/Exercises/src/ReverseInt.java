import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int input,output=0;
       int n=0;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter to input");
       input=scanner.nextInt();
       int temp = input;
       while(temp >= 10) {
    	   temp=temp/10;
    	   n++;
    	   
       }
      while(input>=10) {
    	int k = input%10;
    	temp=1;
        for(int i=0 ;i<n;i++) {
        	temp=temp*10;
        }
        output= output + temp*k;
        input = input /10;
        n--;
       }
       output=output+ input;
       System.out.println("Output is "+ output);
       scanner.close();
	}

}
