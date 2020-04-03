
public class Rectangle extends Shape{
     protected double width;
     protected double length;
     
     public Rectangle()
     {
    	 
     }
     public Rectangle(double width, double length)
     {
    	 this.length = length;
    	 this.width = width;
     }
     public Rectangle(double width, double length, String color, boolean filled)
     {
    	 super(color,filled);
    	 this.length = length;
    	 this.width = width;
     }
     public double getWidth()
     {
    	 return this.width;
     }
     public double getLength()
     {
    	 return this.length;
     }
     public void setWidth(double width)
     {
    	 this.width = width;
     }
     public void setLength(double length)
     {
    	 this.length = length;
     }
     public double getArea()
     {
   	double area = width * length;
   	return area;
     }
     public double getPerimeter()
     {
   	  double perimeter = (width + length) * 2;
   	  return perimeter;
     }
     public String toString()
     {
   	  return ("Width " + width + " Length " + length);
     }
}
