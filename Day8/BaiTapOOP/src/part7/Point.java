package part7;

public class Point {
	
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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

    public String toString() {
        return String.format("Point (%1$d, %2$d)", x, y);
    }
}
