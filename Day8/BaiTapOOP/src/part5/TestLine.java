package part5;

public class TestLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Line l1 = new Line(0, 0, 3, 4);
	        System.out.println(l1);

	        Point p1 = new Point(0, 0);
	        Point p2 = new Point(3, 4);
	        Line l2   = new Line(p1, p2);
	        System.out.println(l2);

	        System.out.println("Line 1 length: " + l1.getLength());
	        System.out.println("Line 1 gradient: " + l1.getGradient());

	        System.out.println("Line 2 length: " + l2.getLength());
	        System.out.println("Line 2 gradient: " + l2.getGradient());

	}

}
