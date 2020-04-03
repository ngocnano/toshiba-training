
public class PascalTriangle1 {

    // Function to print first 
    // n lines of Pascal's Triangle 
    static void printPascal(int n) 
    { 
          
    // Iterate through every line 
    // and print entries in it 
    for (int line = 0; line < n; line++) 
    { 
        // Every line has number of  
        // integers equal to line number 
        for (int i = 0; i <= line; i++) 
        System.out.print(binomialCoeff (line, i)+" "); 
                          
        System.out.println(); 
    } 
    } 
    static void pascal(int n) 
    {
    	int a[][] = new int [n][n];
    	for(int i = 0; i < n; i++) 
    	{
    		for(int j = 0; j < n; j++) 
    		{
    			a[i][j]=0;
    		}
    	}
    	
    	for(int i = 0; i < n; i++) 
    	{
    		for(int j = 0; j <= i; j++) 
    		{
    			if(j == 0) 
    			{
    				a[i][j] = 1;
    			}
    			else 
    			{
					a[i][j]= a[i - 1][j] + a[i - 1][j - 1];
				}
    		}
    	}
    	
    	for(int i = 0; i < n; i++) 
    	{
    		for(int j = 0; j < n; j++) 
    		{
    			System.out.print(a[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
      
    // Link for details of this function  
    static int binomialCoeff(int n, int k) 
    { 
        int res = 1; 
          
        if (k >= n) 
        {
           k = n - k; 
        }
        for (int i = 0; i < k; ++i) 
        { 
            res *= (n - i); 
            res /= (i + 1); 
        } 
        return res; 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 pascal(7); 
	}

}
