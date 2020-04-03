package part2;

public class MyRectangle {
	MyPoint r1;
	MyPoint r2;
	
	public MyRectangle(MyPoint r1, MyPoint r2) 
	{
		this.r1 = r1;
		this.r2 = r2;
	}

	public MyPoint getR1() {
		return r1;
	}

	public void setR1(MyPoint r1) {
		this.r1 = r1;
	}

	public MyPoint getR2() {
		return r2;
	}

	public void setR2(MyPoint r2) {
		this.r2 = r2;
	}
	
	public double getPerimeter() 
	{
		MyPoint m1 = new MyPoint(r1.getX(), r2.getY());
		MyPoint m2 = new MyPoint(r2.getX(), r1.getY());
		return 2.0 * (r1.distance(m2) + r1.distance(m1)); 
	}

	@Override
	public String toString() {
		return "MyRectangle [r1=" + r1 + ", r2=" + r2 + "]";
	}
    
	
}
