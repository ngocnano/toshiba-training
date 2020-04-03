
public class FibonacciInt {
	public static int fibonacci(int x) 
	{
		int num1 = 1;
		int num2 = 1;
		int result =0;
		for( int i = 1; i <= x; i++) 
		{
			result = num1 + num2;
			num1 = num2;
			num2 = result;
		}
		if(x==0) return 0;
		if(x==1) return 1;
		if(x==2) return 1;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=44 ; i <= 46;i++) 
        {
        	if ((Integer.MAX_VALUE / fibonacci(i)) < (i+1)) 
        	{
        		System.out.println("The fibonacci of " + i + " is "+ fibonacci(i));
        		System.out.println("The fibonacci of " + (i+1) + " is out of range");
        		break;
        	}
        	else 
        	{
        		System.out.println("The fibonacci of " + i + " is " + fibonacci(i));;
        		
			}
	}

}
	}
