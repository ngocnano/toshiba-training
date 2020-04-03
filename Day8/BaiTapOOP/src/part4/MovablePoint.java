package part4;

public class MovablePoint extends point2D{
	
	private float xSpeed = 0.0f;
	private float ySpeed = 0.0f;
	
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MovablePoint(float xSpeed, float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public float getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	public float getySpeed() {
		return ySpeed;
	}
	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	public void setSpeed(float x,float y) 
	{
		this.setxSpeed(x);
		this.setySpeed(y);
	}
	
	public float[] getSpeed() 
	{
		float[] speed = new float[2];
		speed[0] = xSpeed;
		speed[1] = ySpeed;
		return speed;
	}
	@Override
	public String toString() {
		return "MovablePoint [xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	public MovablePoint move() 
	{
		this.setX(this.getX() + getxSpeed());
		this.setY(this.getY() + getySpeed());
		return this;
	}
	

}
