package part2;

public class TestMyRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint r1 = new MyPoint(0, 3);
		MyPoint r2 = new MyPoint(5, 0);
		MyRectangle myRectangle = new MyRectangle(r1, r2);
		System.out.println(myRectangle);
		System.out.println(myRectangle.getPerimeter());
		

	}

}
