
public class SelectionSort {
	
	public static void selectionSort(int[] array) 
	{
		for (int i = 0; i < array.length - 1; i++) 
		{
			int min   = array[i];
			int inDex = i;
			for (int j = i + 1; j < array.length; j++) 
			{
				if (array[j] < min) 
				{
					min   = array[j];
					inDex = j;
				}
			}
			
			int temp     = array[i];
			array[i]     = array[inDex];
			array[inDex] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {5, 4, 8, 1, 2, 4, 9, 3, 0};
		selectionSort(array);
		for (int i : array) 
		{
			System.out.println(i);
		}
	}
	}

