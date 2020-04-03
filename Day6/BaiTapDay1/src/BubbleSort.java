
public class BubbleSort {
	public static void bubbleSort(int[] array) 
	{
		for (int i = 0; i < (array.length - 1); i++) 
		{
			for (int j = (array.length - 1); j > i; j-- ) 
			{
				if (array[j] < array[j - 1]) 
				{
					int temp     = array[j];
					array[j]     = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {5, 4, 8, 1, 2, 4, 9, 3, 0};
		bubbleSort(array);
		for (int i : array) 
		{
			System.out.println(i);
		}
	}

}
