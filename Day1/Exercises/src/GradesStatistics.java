import java.util.Scanner;

public class GradesStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numStudent  = 0;
		double average  = 0.0;
		System.out.print("Enter the number of students (> 0): ");
        numStudent = scanner.nextInt();
        int arr[]       = new int [numStudent];
        
        for (int i = 0; i < numStudent; i++) 
        {
        	System.out.print("Enter the grade for student " + (i+1) + ": ");
        	arr[i] = scanner.nextInt();
        }
        
        int min         = arr[0];
        int sum         = 0;
   		int max         = 0;
        
        for ( int i = 0; i < numStudent; i++) 
        {
         	if (arr[i] > max) 
        	{
        		max = arr[i];
        	}
        	if (arr[i] < min) 
        	{
        		min = arr[i];
        	}
        	sum += arr[i];
        }
        average = (double) sum / numStudent;
        
        System.out.printf("The average is: %.2f",average);
        System.out.println();
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
        scanner.close();
        
	}

}
