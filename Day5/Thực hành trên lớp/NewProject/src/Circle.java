
public class Circle extends Shape{
      protected double radius;
      
      public Circle(double radius)
      {
    	  this.radius = radius;
      }
      public Circle(double radius, String color, boolean filled)
      {
    	  super(color,filled);
    	  this.radius = radius;
    	 
      }
      public double getRadius()
      {
    	  return this.radius;
      }
      public void setRadius(double radius)
      {
    	  this.radius = radius;
      }
      
      public double getArea()
      {
    	double area = Math.PI * radius * radius;
    	return area;
      }
      public double getPerimeter()
      {
    	  double perimeter = Math.PI * radius;
    	  return perimeter;
      }
      public String toString()
      {
    	  return ("Radius " + radius);
      }
}
