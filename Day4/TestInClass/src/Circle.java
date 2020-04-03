
public class Circle {
    private double radius = 1.0;
    private String color  = "red";
    
    public Circle()
    {
    	
    }
    public Circle(double radius)
    {
    	this.radius = radius;
    }
    public Circle(String color)
    {
    	this.color = color;
    }
    public Circle(double radius, String color)
    {
    	this.radius = radius;
    	this.color  = color;
    }
    public double getRadius()
    {
    	return this.radius;
    }
    public void setRadius(double radius)
    {
    	this.radius = radius;
    }
    public String getColor()
    {
    	return this.color;
    }
    public void setColor(String color)
    {
    	this.color = color;
    }
    public String toString()
    {
    	return (radius + color + getArea());
    }
    public double getArea()
    {
    	double area = Math.PI * radius * radius;
    	return area;
    }
}
