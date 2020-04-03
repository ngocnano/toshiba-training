package part3;

public class MyPolynomial {
	
	private double[] coeffs;

	public MyPolynomial(double[] coeffs) 
	{
		this.coeffs = coeffs;
	}
	
	public int getDegree() 
	{
		return coeffs.length -1;
	}

	public String toString() 
	{
		String temp = new String();
		for(int i = coeffs.length - 1; i >= 0; i--) 
		{
			temp = temp.concat( coeffs[i] + "x^" + i);
			if(i != 0) 
			{
				temp = temp.concat(" + ");
			}
		}
		return temp;
	}
	
	public double evaluate(double x) 
	{
		double sum = 0.0;
		for (int i = 0; i < coeffs.length; i++) 
		{
			sum += (coeffs[i] * Math.pow(x, 1));
		}
		return sum;
	}
	
	public MyPolynomial add(MyPolynomial right) 
	{
		int n;
		if(right.coeffs.length > coeffs.length) 
		{
			n = coeffs.length;
		}
		else 
		{
			n  = right.coeffs.length;
		}
		
		for(int i = 0; i < n; i++) 
		{
			coeffs[i] += right.coeffs[i];
		}
		if(right.coeffs.length > coeffs.length) 
		{
			coeffs = right.coeffs;
		}
		return this;
	}
	
	public MyPolynomial multiplies(MyPolynomial right) 
	{
		int n;
		if(right.coeffs.length > coeffs.length) 
		{
			n = coeffs.length;
		}
		else 
		{
			n  = right.coeffs.length;
		}
		
		for(int i = 0; i < n; i++) 
		{
			coeffs[i] *= right.coeffs[i];
		}
		if(right.coeffs.length > coeffs.length) 
		{
			coeffs = right.coeffs;
		}
		return this;
	}
}
