
public class Matrix {
	public static boolean haveSameDimension(int[][] m1, int[][] m2) 
	{
		int dimensionM1 = m1[0].length;
		int dimensionM2 = m2[0].length;
		
		if(dimensionM1 == dimensionM2) 
		{
			return true;
		}
		else 
		{
		    return false;	
		}
	}
	
	public static boolean haveSameDimension(double[][] m1, double[][] m2) 
	{
		int dimensionM1 = m1[0].length;
		int dimensionM2 = m2[0].length;
		
		if(dimensionM1 == dimensionM2) 
		{
			return true;
		}
		else 
		{
		    return false;	
		}
	}
	
	public static void print(int[][] m) 
	{
		int leight = m[0].length;
		for(int i = 0; i < leight; i++) 
		{
			for(int j = 0; j < leight; j++) 
			{
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void print(double[][] m) 
	{
		int leight = m[0].length;
		for(int i = 0; i < leight; i++) 
		{
			for(int j = 0; j < leight; j++) 
			{
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static double[][] add(double[][] m1, double[][] m2)
	{
		int leight = m1[0].length;
		double result[][] = new double[leight][leight];
		for(int i = 0; i < leight; i++) 
		{
			for(int j = 0; j < leight; j++) 
			{
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return result;
	}
	
	public static int[][] add(int[][] m1, int[][] m2)
	{
		int leight = m1[0].length;
		int result[][] = new int[leight][leight];
		for(int i = 0; i < leight; i++) 
		{
			for(int j = 0; j < leight; j++) 
			{
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return result;
	}
	
	public static double[][] subtract(double[][] m1, double[][] m2)
	{
		int leight = m1[0].length;
		double result[][] = new double[leight][leight];
		for(int i = 0; i < leight; i++) 
		{
			for(int j = 0; j < leight; j++) 
			{
				result[i][j] = m1[i][j] - m2[i][j];
			}
		}
		return result;
	}
	
	public static int[][] subtract(int[][] m1, int[][] m2)
	{
		int leight = m1[0].length;
		int result[][] = new int[leight][leight];
		for(int i = 0; i < leight; i++) 
		{
			for(int j = 0; j < leight; j++) 
			{
				result[i][j] = m1[i][j] - m2[i][j];
			}
		}
		return result;
	}
	
	public static double[][] multiply(double[][] m1, double[][] m2)
	{
		int leight = m1[0].length;
		double result[][] = new double[leight][leight];
		for(int i = 0; i < leight; i++) 
		{
			for(int j = 0; j < leight; j++) 
			{
				result[i][j] = m1[i][j] * m2[i][j];
			}
		}
		return result;
	}
	
	public static int[][] multiply(int[][] m1, int[][] m2)
	{
		int leight = m1[0].length;
		int result[][] = new int[leight][leight];
		for(int i = 0; i < leight; i++) 
		{
			for(int j = 0; j < leight; j++) 
			{
				result[i][j] = m1[i][j] * m2[i][j];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int m1[][] = {{1,2,3},{1,2,3},{1,2,3}};
		int m2[][] = {{1,2,3},{1,2,3},{1,2,3}};
		int m3[][] = add(m1, m2);
		print(m3);
		
	}

}
