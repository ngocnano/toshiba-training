
public class Swap {
	public static boolean swap(int[] array1, int[] array2) 
	{
		if (array1.length != array2.length) 
		{
			return false;
		}
		for (int i = 0; i < array1.length; i++) 
		{
			int temp = array1[i];
			array1[i] = array2[i];
			array2[i] = temp;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]  = {1, 2, 3, 4, 5};
		int array2[]  = {6, 7, 8, 9, 10};
		boolean check = swap(array1, array2);
		if (check == true) 
		{
			System.out.println("Array is swaped");
		}
		else
		{
		  	System.out.println("Swap fail!");
		}
	}

}
