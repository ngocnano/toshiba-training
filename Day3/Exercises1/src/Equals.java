
public class Equals {
	public static boolean equals(int[] array1, int[] array2) 
	{
		if (array1.length != array2.length) 
		{
			return false;
		}
		for (int i = 0; i < array1.length; i++) 
		{
			if(array1[i] != array2[i]) 
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int array1[] = {1, 2, 3, 4, 5};
		 int array2[] = {1, 2, 3, 4, 5};
		 
		 if (equals(array1, array2) == true) 
		 {
			 System.out.println("Array 1 is equal Array 2");
		 }
		 else 
		 {
			 System.out.println("Array 1 is not equal Array 2");
		 }
	}

}
