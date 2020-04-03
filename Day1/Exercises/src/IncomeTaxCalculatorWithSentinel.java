import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   final double ABOVE_20K=0.1;
	       final double ABOVE_40K=0.2;
	       final double ABOVE_60K=0.3;
	       
	       int taxableIncome,k;
	       double taxPayable=0.0;
	       Scanner scanner = new Scanner(System.in);
	       
	       while(true) {
	       System.out.print("Enter the taxable income:");
	       taxableIncome=scanner.nextInt();
	       if(taxableIncome == -1) break;
	       if(taxableIncome<=20000) k=1; else if(taxableIncome<=40000) k=2; 
	       else if (taxableIncome<=60000) k=3; else k=4;
	       switch (k) {
		case 1:
			taxPayable=0.0;
			break;
		case 2:
			taxPayable=(taxableIncome-20000) * ABOVE_20K;
	        break;
		case 3:
			taxPayable=(taxableIncome-40000) * ABOVE_40K + 20000 * ABOVE_20K;
			break;
		case 4:
			taxPayable=(taxableIncome-60000) * ABOVE_60K + 20000*ABOVE_20K + 20000*ABOVE_40K;
			break;
		default:
			break;
		}
	       System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
	       }
	       scanner.close();
	       
	}

}
