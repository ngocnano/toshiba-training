package part3;

public class TestMyPolynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test program
		// Can invoke with a variable number of arguments
		//MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
		//MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
		// Can also invoke with an array
		double coeffs[] = {1.2, 3.4, 5.6, 7.8};
		double coeffs1[] = {1.1, 2.2, 3.3, 4.4, 5.5};
		MyPolynomial p1 = new MyPolynomial(coeffs1);
		MyPolynomial p2 = new MyPolynomial(coeffs);
		System.out.println(p2);
		p2.add(p1);
		System.out.println(p2);
		System.out.println(p2.evaluate(1.0));

	}

}
