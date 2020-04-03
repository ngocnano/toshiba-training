
public class ComputePI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double sum = 0.0;
       int max = 100000;
       int i=1,k=1;
       while(i<=max) {
    	   sum= sum +k*(1.0/i);
    	   i+=2;
    	   k=k*(-1);
       }
       System.out.println("value of PI "+ sum*4);
	}

}
