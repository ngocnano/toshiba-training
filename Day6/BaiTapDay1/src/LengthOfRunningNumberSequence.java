
public class LengthOfRunningNumberSequence {
	public static double numOfDigits(int n) 
	{
		double num  = 1.0;
		int temp = n;
		while(temp >= 10) 
		{
			temp = temp / 10;
			num ++;
		}
		return num;
	}
	
	public static int recursive(int n) 
	{
		
		if(n == 1) 
		{
			return 1;
		}
		else 
		{
			return (n + (int)Math.pow(10.0, numOfDigits(n)) * recursive(n - 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recursive(9));
	}

}
