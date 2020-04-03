
public class GCDEuclid {

	public static int gcdRecursive(int a, int b) 
	{
		if (b == 0) 
		{
			return a;
		}
		else 
		{
			return gcdRecursive(b, a % b);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println(gcdRecursive(15, 5));
		System.out.println(gcdRecursive(99, 88));
	}

}
