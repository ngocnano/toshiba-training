
public class SpecialSeries {
	public static double specialSeries(double x, int numTerms) 
	{
		double result = 0.0;
		double count = 1.0;
		double sum = 1.0;
		while(true) 
		{
			if (count > numTerms) 
			{
				break;
			}
			sum = sum * (count / (count + 1));
			result =result + (Math.pow(x, count) / count) + sum;
			count = count + 2;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(specialSeries(1, 3));
	}

}
