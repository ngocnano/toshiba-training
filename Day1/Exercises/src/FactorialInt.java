
public class FactorialInt {
	public static int factorial(int x) 
	{
		int result = 1;
		for( int i = x; i >= 1; i--) 
		{
			result = result * i;
		}
		if(x==0) return 0;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1 ; i <= 13;i++) 
        {
        	if ((Integer.MAX_VALUE / factorial(i)) < (i+1)) 
        	{
        		System.out.println("The factorial of " + i + " is "+ factorial(i));
        		System.out.println("The factorial of " + (i+1) + " is out of range");
        		break;
        	}
        	else 
        	{
        		System.out.println("The factorial of " + i + " is " + factorial(i));;
        		
			}
       }
	}

}
