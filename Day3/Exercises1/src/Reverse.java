
public class Reverse {
	public static void reverse(int[] array) 
	{
		int i = 0;
		int j = array.length - 1;
		while(i <= j) 
		{
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  = {1, 2, 3, 4};
		
		System.out.print("the reverse of ");
		for (int i : arr) 
		{
			System.out.print(i + " ");
		}
		System.out.print(" is ");
		reverse(arr);
		for (int i : arr) 
		{
			System.out.print(i + " ");
		}
		
	}

}
