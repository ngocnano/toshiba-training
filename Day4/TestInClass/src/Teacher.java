
public class Teacher extends Person{
	  private int numCourse   = 0;
	  private String course[] = {};
	  
	  
	    public Teacher(String name,String address) 
	    {
	    	super(name,address);
	    }
	    public boolean addCourse(String course) 
	    {
	    	for(int i=0;i<numCourse;i++) 
	    	{
	    		if( this.course[i].equals(course) == true) 
	    		{
	    			return false;
	    		}
	    	}
	    	return true;
	    }
	    public boolean removeCourse() 
	    {
	    	for(int i=0;i<numCourse;i++) 
	    	{
	    		if( this.course[i].equals(course) == true) 
	    		{
	    			return true;
	    		}
	    	}
	    	return false;
	    }
	    public String toString() 
	    {
	    	return ("Name teacher " + getName());
	    }

}
