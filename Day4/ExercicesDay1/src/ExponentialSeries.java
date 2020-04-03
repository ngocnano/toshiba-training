
public class ExponentialSeries {
	public static double factorial(int x) 
	{
		double result = 1.0;
		for( int i = x; i >= 1; i--) 
		{
			result = result * i;
		}
		if(x==0) return 0.0;
		return result;
	}
	
	public static double exp(int numTerms) 
	{
		double result = 1.0;
		for(int i = 1; i <= numTerms; i++) 
		{
			result = result + (1.0 / factorial(i));
		}
		return result;
	}
	
	public static double exp(double x, int numTerms) 
	{
		double result = 1.0;
		for(int i = 1; i <= numTerms; i++) 
		{
			result = result + (Math.pow(x, i) / factorial(i));
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(exp(10));
        System.out.println(Math.E);
	}

}
