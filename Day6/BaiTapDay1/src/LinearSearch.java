
public class LinearSearch {
	// Return true if the key is found inside the array
	public static boolean linearSearch(int[] array, int key) 
	{
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i] == key) 
			{
				return true;
			}
		}
		
		return false;
	}
	
	// Return the array index, if key is found; or 0 otherwise
	public static int linearSearchIndex(int[] array, int key) 
	{
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i] == key) 
			{
				return (i + 1);
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array = {1, 2, 3, 4};
        int key     = 4;
        System.out.println(linearSearch(array, key));
        System.out.println(linearSearchIndex(array, key));
	}

}
