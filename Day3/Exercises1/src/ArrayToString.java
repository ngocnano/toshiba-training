
public class ArrayToString {
	public static String arrayToString(int[] array) 
	{
		String result = new String();
		for (int i = 0; i < array.length; i++) 
		{
		 	result = result.concat(Integer.toString(array[i]) + " ");
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {1, 2, 3, 4};
        String result = arrayToString(arr);
        System.out.println(result);
	}

}
