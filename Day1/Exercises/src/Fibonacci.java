
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int f1=1,f2=1,fn=0;
        int n=20,sum=2;
        double average;
        System.out.print(1+" ");
        System.out.print(1+" ");
        for(int i=3;i<=n;i++) {
        	fn=f1+f2;
        	sum+=fn;
        	System.out.print(fn+" ");
        	f1=f2;
        	f2=fn;
        }
        System.out.println();
        average=(double)sum/n;
        System.out.println("average = "+ average);
	}

}
