import java.util.Scanner;


public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int sizeOfArray = scanner.nextInt();
        int arr[]       = new int[sizeOfArray];
        
        System.out.print("Enter the value of all items (separated by space): ");
        for (int temp = 0; temp < sizeOfArray; temp++) 
        {
        	arr[temp] = scanner.nextInt();
        }
        
        System.out.print("The values are: [");
        for (int temp = 0; temp < sizeOfArray; temp++) 
        {
        	System.out.print(arr[temp]);
        	if (temp != (sizeOfArray -1)) 
        	{
        		System.out.print(", ");
        	}
        }
        System.out.println("]");
        scanner.close();
	}

}
