
public class Square extends Rectangle{
      
      public Square()
      {
    	  
      }
      public Square(double side)
      {
    	  this.width  = side;
    	  this.length = side;
      }
      public Square(double side, String color, boolean filled)
      {
    	  super.color  =  color;
    	  super.filled = filled;
    	  setWidth(side);
    	  setLength(side);
      }
      public double getSide()
      {
    	  return this.width;
      }
      public void setSide(double side)
      {
    	  this.width  = side;
    	  this.length = side;
      }
      public void setWidth(double side)
      {
    	  this.width = side;
      }
      public void setLength(double side)
      {
    	  this.length = side;
      }
      public String toString()
      {
    	  return ("Side " + this.width);
      }
      
}
