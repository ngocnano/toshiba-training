
public class QuickSort {
	
	public static void swap(int a, int b) 
	{
		int temp = a;
		a = b;
		b = temp;
	}
	public static void quickSort(int[] array, int left, int right)
	{
		if (left >= right) 
		{
			return;
		}
		
		int privot = array[(left + right) / 2];
		int i = left;
		int j = right;
		
		while(i <= j) 
		{
			while(array[i] < privot) 
			{
				i++;
			}
			while (array[j] > privot) {
				j--;
			}
			
			if (i <= j) 
			{
				int temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
				i++;
				j--;
			}
			
		}
		quickSort(array, left, j);
		quickSort(array, i, right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 4, 8, 1, 2, 4, 9, 3, 0};
		quickSort(array, 0, 8);
		for (int i : array) 
		{
			System.out.println(i);
		}
	}

}
