
public class InsertionSort {
	public static void insertionSort(int[] array) 
	{
		for (int i = 1; i < array.length; i++) 
		{
			int value = array[i];
			int inDex = i;
			for (int j = i - 1; j >= 0; j--) 
			{
				if (value < array[j]) 
				{
					array[j + 1] = array[j];
					inDex = j;
			     }		 
			}
			array[inDex] = value;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 4, 8, 1, 2, 4, 9, 3, 0};
		insertionSort(array);
		for (int i : array) 
		{
			System.out.println(i);
		}
	}

}
