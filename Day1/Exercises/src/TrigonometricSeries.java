
public class TrigonometricSeries {
	public static double tinhGiaiThua(int x) 
	{
		double result = 1.0;
		for( int i = x; i >= 1; i--) 
		{
			result = result * i;
		}
		if(x==0) return 0.0;
		return result;
	}
	public static double sin(double x, int numTerms) 
	{
		double result = 0.0;
		result = x - (Math.pow(x, 3.0) / tinhGiaiThua(3))
				   + (Math.pow(x, 5.0) / tinhGiaiThua(5))
				   - (Math.pow(x, 7.0) / tinhGiaiThua(7))
				   + (Math.pow(x, 9.0) / tinhGiaiThua(9));
		return result;
	}

	public static double cos(double x, int numTerms) 
	{
		double result = 0.0;
		result = 1 - (Math.pow(x, 2.0) / tinhGiaiThua(2))
				   + (Math.pow(x, 4.0) / tinhGiaiThua(4))
				   - (Math.pow(x, 6.0) / tinhGiaiThua(6))
				   + (Math.pow(x, 8.0) / tinhGiaiThua(8));
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(sin(Math.PI / 4, 1));
        System.out.println(Math.sin(Math.PI / 4));
        System.out.println(cos(Math.PI / 4, 1));
        System.out.println(Math.cos(Math.PI / 4));
	}

}
