
public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int sum=0;
       double average;
       int lowerbound = 1,upperbound = 100;
       for(int i=lowerbound;i<=upperbound;i++) {
    	   sum+=i;
       }
       average = (double)sum / (upperbound-lowerbound+1);
       
       System.out.println("Sum = "+ sum);
       System.out.println("Average = "+ average);
	}

}
