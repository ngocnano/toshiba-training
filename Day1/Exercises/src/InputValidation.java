import java.text.BreakIterator;
import java.util.Scanner;

public class InputValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int input;
      boolean test=false;
      Scanner scanner = new Scanner(System.in);
      while(true) {
      System.out.println("Enter a number between 0-10 or 90-100:");
     
      input=scanner.nextInt();
      if((input >= 0) && (input <=10)) test=true;
      if((input>=90) && (input<=100)) test=true;
      if(test==true) break; else System.out.println("Invalid input, try again...");}
      System.out.println("You have entered:"+input);
      scanner.close();
	}

}
