
public class PrintTriangles {
	
	 public static void printPowerOf2Triangle(int size) 
	  	{
	    	  for (int i = 1; i <= size; i++) 
	  		{
	    		int mid = (int) Math.pow(2.0, (i - 1.0)); 
	  			int temp1 = size - i + 1;
	  			int temp2 = size + i - 1;
	  			for (int j = 0; j < (2 * size); j++) 
	  			{
	  				int temp;
	  				if (j == size) 
	  				{
	  					System.out.printf("%4d",mid);
	  				}
	  				else if ((j < size) && (j >= temp1)) 
	  				{
	  					temp = mid / (int )Math.pow(2.0, (size - j));
	  					System.out.printf("%4d",temp);
	  				}
	  				else if((j > size) && (j <= temp2)) 
	  				{

	  					temp = mid / (int )Math.pow(2.0, (j - size));
	  					System.out.printf("%4d",temp);
	  				}
	  				else 
	  				{
	  					System.out.print("    ");
	  				}
	  			}
	  		    System.out.println();
	  	       }
	  	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        printPowerOf2Triangle(8);
		
	}

}
