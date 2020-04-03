
public class Contains {
	public static boolean contains(int[] array, int key) 
	{
		for (int temp = 0; temp < array.length; temp++) 
		{
			if (array[temp] == key) 
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {1, 2, 3, 4, 5};
        int key   = 5;
        
        if (contains(arr, key) == true) 
        {
        	System.out.println("Array contains key");
        }
        else 
        {
			System.out.println("Array don't contains key");
		}
	}

}
