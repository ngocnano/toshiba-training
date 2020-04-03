package part2;

public class MyPoint {
	private int x = 0;
	private int y = 0;
	
	public MyPoint(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}

	public MyPoint() {
		
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
	
	public int[] getXY() 
	{
		int array[] = {x, y};
		return array;
	}
	
	public void setXY(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}
	
	public double distance(int x, int y) 
	{
		double dis = Math.sqrt(Math.pow((this.x - x), 2.0) + Math.pow((this.y - y), 2.0));
		return dis;
	}
	
	public double distance(MyPoint another) 
	{
		double dis = Math.sqrt(Math.pow((this.x - another.getX()), 2.0) + Math.pow((this.y - another.getY()), 2.0));
		return dis;
	}
	
	public double distance() 
	{
		double dis = Math.sqrt(Math.pow(this.x, 2.0) + Math.pow(this.y, 2.0));
		return dis;
	}

}
