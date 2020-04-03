package part2;

public class MyCircle {
	
	private MyPoint center = new MyPoint(0, 0);
	private int radius     = 1;
	
	public MyCircle(int x, int y, int radius) {
		this.radius = radius;
		center.setX(x);
		center.setY(y);
	}

	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public MyCircle() 
	{
		
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int  getCenterX() 
	{
		return center.getX();
	}
	
	public int  getCenterY() 
	{
		return center.getY();
	}
	
	public int[]  getCenterXY() 
	{
		return center.getXY();
	}
	
    public void setCenterX(int x) 
    {
    	center.setX(x);
    }
    
    public void setCenterY(int y) 
    {
    	center.setY(y);
    }
    
    public void setCenterXY(int x, int y) 
    {
    	center.setXY(x,y);
    }

	@Override
	public String toString() {
		return "MyCircle [center=" + center + ", radius=" + radius + "]";
	}
    
	public double getArea() 
	{
		return Math.PI * radius * radius;
	}
	
	public double getCircumference() 
	{
		return 2.0 * Math.PI * radius;
	}
	
	public double distance(MyCircle another) 
	{
		return center.distance(another.center); // use distance() of MyPoint
	}
}
