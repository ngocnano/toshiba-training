package part5;

public class Point {
	private int x = 0;
	private int y = 0;;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {
		super();
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	
	public int[] getXY() 
	{
		int xy[] = new int[2];
		xy[0] = x;
		xy[1] = y;
		return xy;
	}
	@Override
	public String toString() {
		return "point2D [x=" + x + ", y=" + y + "]";
	}
	

}
