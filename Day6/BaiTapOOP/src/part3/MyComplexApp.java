package part3;

import java.util.Scanner;

public class MyComplexApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double real;
		double imag;
		System.out.println("Enter complex number 1 (real and imaginary part): ");
		real = scanner.nextDouble();
		imag = scanner.nextDouble();
		
		MyComplex c1 = new MyComplex(real,imag);
		
		System.out.println("Enter complex number 2 (real and imaginary part): ");
		real = scanner.nextDouble();
		imag = scanner.nextDouble();
		
		MyComplex c2 = new MyComplex(real,imag);
		
		System.out.println(c1);
		System.out.println(c2);
		
		if (c1.isReal()) 
		{
			System.out.println(c1 + "is a pure real number");
		}
		else 
		{
			System.out.println(c1 + "is  NOT a pure real number");
		}
		
		if (c1.isImag()) 
		{
			System.out.println(c1 + "is a pure imag number");
		}
		else 
		{
			System.out.println(c1 + "is  NOT a pure imag number");
		}
		
		if (c2.isReal()) 
		{
			System.out.println(c2 + "is a pure real number");
		}
		else 
		{
			System.out.println(c2 + "is  NOT a pure real number");
		}
		
		if (c2.isImag()) 
		{
			System.out.println(c2 + "is a pure imag number");
		}
		else 
		{
			System.out.println(c2 + "is  NOT a pure imag number");
		}
		
		if (c1.equals(c2)) 
		{
			System.out.println(c1 + "is equal to" + c2);
		}
		else 
		{
			System.out.println(c1 + "is NOT equal to" + c2);
		}
		
		System.out.println(c1.addNew(c2));
		System.out.println(c1.subtract(c2));
        scanner.close();
	}

}
