import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistic {
	public static int[] grades;
	public static void readGrades() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numberOfStudent = scanner.nextInt();
		grades = new int [numberOfStudent];
		for (int i = 0; i < numberOfStudent; i++) 
		{
			System.out.print("Enter the grade for student " + i);
			grades[i] = scanner.nextInt();
		}
		scanner.close();
	}
	public static void print(int[] array) 
	{
		System.out.print("The grades are: [");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]);
			if(i != (array.length - 1)) 
			{
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	public static double average(int[] array) 
	{
		int sum        = 0;
		double average = 0.0;
		for (int i = 0; i < array.length; i++) 
		{
			sum += array[i];
		}
		average = (double) sum / array.length;
		return average;
	}
	public static double median(int[] array) 
	{
		Arrays.sort(array);
		double median = 0.0;
		if (array.length % 2 ==0) 
		{
			int temp = array.length / 2;
			median = (array[temp - 1] + array[temp]) / 2.0;
			return median;
		}
		else 
		{
			median = array[array.length / 2];
			return median;
		}
	}
	public static int max(int[] array)
	{
		int max = array[0];
		for (int i = 0; i < array.length; i++)	
		{
			if (array[i] > max) 
			{
				max = array[i];
			}
		}
		return max;
	}
	public static int min(int[] array) 
	{
		int min = array[0];
		for (int i = 0; i < array.length; i++)	
		{
			if (array[i] < min) 
			{
				min = array[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readGrades(); 
		print(grades);
		System.out.println("The average is " + average(grades));
		System.out.println("The median is " + median(grades));
		System.out.println("The minimum is " + min(grades));
		System.out.println("The maximum is " + max(grades));
	}

}
