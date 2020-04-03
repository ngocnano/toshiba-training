
public class GCD {
	public static int gcd(int a, int b) 
	{
		if ((a == 0) || (b == 0)) 
		{
			return (a + b);
		}
		if(a == b) 
		{
			return a;
		}
		
		if(a > b) 
		{
			return gcd(a - b, b);
		}
		else 
		{
			return gcd(a, b - a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(gcd(5, 7));
	}

}
