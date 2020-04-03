
public class Print {
	public static void print(int[] array) 
	{
		System.out.print("Array is [");
		for (int i = 0; i < array.length; i++) 
		{
		    System.out.print(array[i]);
		    if (i != (array.length - 1)) 
		    {
		    	System.out.print(", ");
		    }
		}
		System.out.print("]");
	}
	public static void print(double[] array) 
	{
		System.out.print("Array is [");
		for (int i = 0; i < array.length; i++) 
		{
		    System.out.print(array[i]);
		    if (i != (array.length - 1)) 
		    {
		    	System.out.print(", ");
		    }
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, 2, 3, 4};
        print(arr);
	}

}
