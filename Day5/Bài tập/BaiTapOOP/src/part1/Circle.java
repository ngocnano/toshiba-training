package part1;

public class Circle 
{
	// Save as "Circle.java"
	// private instance variable, not accessible from outside this class
	private double radius;
	private String color;

	// The default constructor with no argument.
	// It sets the radius and color to their default value.
	public Circle() 
	{
		 radius = 1.0;
		 color = "red";
	}

	// 2nd constructor with given radius, but color default
	public Circle(double r) 
	{
	     radius = r;
		 color = "red";
	}
	
	// 3rd constructor to construct a new instance of Circle with the given radius and color
	public Circle (double r, String c) 
	{
		this.radius = r;
		this.color  = c;
	}
	
	// Getter for instance variable color
	public String getColor() 
	{
		return this.color;
	}

	// Setter for instance variable radius
	public void setRadius(double newRadius) 
	{
		this.radius = newRadius;
	}
	
	// Setter for instance variable color
	public void setColor(String newColor) 
	{
		this.color = newColor;
	}
	// A public method for retrieving the radius
	public double getRadius() 
	{
		 return radius;
	}

	// A public method for computing the area of circle
	public double getArea() 
	{
	return radius*radius*Math.PI;
	}
		

}
