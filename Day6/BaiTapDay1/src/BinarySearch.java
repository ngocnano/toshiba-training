
public class BinarySearch {
	// Return true if key is found in the array in the range of fromIdx (inclusive) totoIdx (exclusive)
	public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) 
	{
		int midle = (fromIdx + toIdx) / 2;
		if (array[midle] == key) 
		{
			return true;
		}
		else if (fromIdx >= toIdx) 
		{
			return false;
		}
		else 
		{
			if (key > array[midle]) 
			{
				return binarySearch(array, key, midle + 1, toIdx);
			}
			else 
			{
				return binarySearch(array, key, fromIdx, midle - 1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4};
        int key     = 4;
        System.out.println(binarySearch(array, key,0,3));
	}

}
