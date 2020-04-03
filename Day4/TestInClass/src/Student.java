
public class Student extends Person{
    private int numCourse   = 0;
    private String course[] = {};
    private int  grades[]   = {};
    
    public Student(String name,String address) 
    {
    	super(name,address);
    }
    public void addCourseGrade(String course, int grade) 
    {
    	String tempCourse[] = new String [numCourse + 1];
    	int tempGrade[]     = new int [numCourse + 1];
        
    	for(int i = 0; i < numCourse; i++) 
    	{
    		tempCourse[i] = this.course[i];
    		tempGrade[i]  = this.grades[i];
    	}
    	
    	this.numCourse ++;
    	tempCourse[numCourse -1] = course;
    	tempGrade[numCourse - 1] = grade;
    	
    	this.course = tempCourse;
    	this.grades = tempGrade;
    	
    }
    
    public void printGrade() 
    {
    	for( int i=0; i< numCourse;i++) 
    	{
    		System.out.print("grade " + (i+ 1) + " is " + grades[i]);
    		System.out.println();
    	}
    }
    public double getAverageGrade() 
    {
    	double result = 0.0;
    	int    sum =0;
    	for( int i=0; i< numCourse;i++) 
    	{
    		sum = sum + grades[i];
    	}
    	result = (double) (sum / numCourse);
    	return result;
    }
    public String toString() 
    {
    	return ("Name student " + getName());
    }
}
