
public class CopyOf {
	public static int[] copyOf(int[] array) 
	{
		int newArray[] = new int [array.length];
		for (int i = 0; i < array.length; i++) 
		{
			newArray[i] = array[i];
		}
		return newArray;
	}
	public static int[] copyOf(int[] array, int newLength) 
	{
		int newArray[] = new int [newLength];
		for (int i = 0; i < array.length; i++) 
		{
			newArray[i] = array[i];
		}
		return newArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int arr[] = {1, 2, 3, 4, 5};
		   int newLenght = 6;
		   
		   int arr1[] = copyOf(arr);
		   
		   System.out.print("Array is copied ");
		   for (int i : arr1) 
		   {
			   System.out.print(i + " ");
		   }
	}

}
