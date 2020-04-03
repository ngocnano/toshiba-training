
public class Search {
	public static int search(int[] array, int key) 
	{
		for (int temp = 0; temp < array.length; temp++) 
		{
			if (array[temp] == key) 
			{
				return temp;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]  = {1, 2, 3, 4};
		 int key    = 3;
		 int result = search(arr, key);
		 
		 if (result == -1) 
		 {
			 System.out.println("Not found");
		 }
		 else 
		 {
			System.out.println("The position of the key is " + result);
		 }
	}

}
