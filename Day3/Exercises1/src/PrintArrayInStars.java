import java.util.Scanner;

public class PrintArrayInStars {

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
        
        for (int temp = 0; temp < sizeOfArray; temp++) 
        {
        	System.out.print(temp + ": ");
        	for (int i=0; i < arr[temp]; i++) 
        	{
        		System.out.print("*");
        	}
        	System.out.print("(" + arr[temp] +")");
        	System.out.println();
        }
        scanner.close();
	}

}
