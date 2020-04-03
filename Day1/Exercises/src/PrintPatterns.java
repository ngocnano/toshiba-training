
public class PrintPatterns {
	public static void printPatternA(int size)
	{
		for (int i = 0; i <= (size/ 2); i++) 
		{
			for (int j = 0; j < size; j++) 
			{
				if ((j >= i) && (j <= (size-i-1)))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printPatternB(int size)
	{
		int mid = size / 2;
		for (int i = 0; i <= (size / 2); i++) 
		{
			for (int j = 0; j < size; j++) 
			{
				if ((j <= (mid + i)) && (j >= (mid-i)))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printPatternC(int size)
	{
		int mid = size / 2;
		for (int i = 0; i <= (size / 2); i++) 
		{
			for (int j = 0; j < size; j++) 
			{
				if ((j <= (mid + i)) && (j >= (mid-i)))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= (size/ 2); i++) 
		{
			for (int j = 0; j < size; j++) 
			{
				if ((j >= i) && (j <= (size-i-1)))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
			
	}
	
	public static void printPatternD(int size) 
	{
		for (int i = 1; i <= size; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				if(j <= (i + 1))
				{
					System.out.print(j  + " ");
				}				
			}
			System.out.println();
		}
	}
	
	public static void printPatternE(int size) 
	{
		for (int i = 1; i <= size; i++) 
		{
			for (int j = 1; j <= size; j++) 
			{
				if(j >= i)
				{
					System.out.print(((j - i) + 1) + " ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printPatternF(int size) 
	{
		for (int i = 1; i <= size; i++) 
		{
			for (int j = 1; j <= size; j++) 
			{
				if(j > (size - i))
				{
					System.out.print( ((size - j) + 1) + " ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printPatternG(int size) 
	{
		for (int i = 1; i <= size; i++) 
		{
			for (int j = 1; j <= size; j++) 
			{
				if(j <= (size + 1 - i))
				{
					System.out.print( (size + 2 - j - i) + " ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
      public static void printPatternH(int size) 
	{
		
		for (int i = 1; i <= size; i++) 
		{
			int temp1 = size - i + 1;
			int temp2 = size + i - 1;
			for (int j = 0; j < (2 * size); j++) 
			{
				if (j == size) 
				{
					System.out.print(i + " ");
				}
				else if ((j < size) && (j >= temp1)) 
				{
					System.out.print((j - temp1 + 1) + " ");
				}
				else if((j > size) && (j <= temp2)) 
				{
					System.out.print((temp2 - j + 1) + " ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
		    System.out.println();
	       }
	}
      
      public static void printPatternI(int size) 
  	{
  		
  		for (int i = 1; i <= size; i++) 
  		{
  			int temp1 = i;
  			int temp2 = (2 * size) - i;
  			for (int j = 0; j < (2 * size); j++) 
  			{
  				if (j == size) 
  				{
  					System.out.print((size - i + 1) + " ");
  				}
  				else if ((j < size) && (j >= temp1)) 
  				{
  					System.out.print((j - temp1 + 1) + " ");
  				}
  				else if((j > size) && (j <= temp2)) 
  				{
  					System.out.print( (temp2 - j + 1) + " ");
  				}
  				else 
  				{
  					System.out.print("  ");
  				}
  			}
  		    System.out.println();
  	       }
  	}
      
      public static void printPatternJ(int size) 
    	{
    		
    		for (int i = 1; i <= size; i++) 
    		{
    			int temp1 = i;
    			int temp2 = (2 * size) - i;
    			for (int j = 1; j < (2 * size); j++) 
    			{
    				if (j <= temp1) 
    				{
    					System.out.print( j + " ");
    				}
    				else if (j >= temp2) 
    				{
    					System.out.print( (temp2 - j + i) + " ");
    				}
    				else 
    				{
    					System.out.print("  ");
    				}
    			}
    		    System.out.println();
    	       }
    	}
      
      public static void printPatternK(int size) 
  	{
  		int hight = 2 * size;
  		for (int i = 1; i <= size; i++) 
  		{
  			int temp1 = size - i + 1;
  			int temp2 = size + i - 1;
  			for (int j = 1; j < hight; j++) 
  			{
  				if (j <= temp1) 
  				{
  					System.out.print( j + " ");
  				}
  				else if (j >= temp2) 
  				{
  					System.out.print( ((hight - 1) - j  + 1) + " ");
  				}
  				else 
  				{
  					System.out.print("  ");
  				}
  			}
  		    System.out.println();
  	       }
  	}
      public static void printPatternL(int size) 
  	{
    	  for (int i = 1; i <= size; i++) 
  		{
    		int mid = (1 + 2 * (i -1)) % 10; 
  			int temp1 = size - i + 1;
  			int temp2 = size + i - 1;
  			for (int j = 0; j < (2 * size); j++) 
  			{
  				int temp;
  				if (j == size) 
  				{
  					System.out.print(mid + " ");
  				}
  				else if ((j < size) && (j >= temp1)) 
  				{
  					temp = mid - (size - j);
  					if (temp < 0) 
  					{
  						temp = 10 + temp;
  					}
  					System.out.print(temp + " ");
  				}
  				else if((j > size) && (j <= temp2)) 
  				{

  					temp = mid - (j - size);
  					if (temp < 0) 
  					{
  						temp = 10 + temp;
  					}
  					System.out.print(temp + " ");
  				}
  				else 
  				{
  					System.out.print("  ");
  				}
  			}
  		    System.out.println();
  	       }
  	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	printPatternA(11);
      //  printPatternB(11);
		//printPatternC(11);
		//printPatternD(11);
		//printPatternF(8);
		//printPatternG(8);
		//printPatternH(8);
		//printPatternI(8);
		//printPatternJ(8);
		//printPatternK(8);
		printPatternL(8);
		
	}

}
