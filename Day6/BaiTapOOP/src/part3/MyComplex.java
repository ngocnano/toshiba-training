package part3;

public class MyComplex {

	private double real = 0.0;
	private double imag = 0.0;
	
	public MyComplex() {
		super();
	}

	public MyComplex(double real, double imag) {
		super();
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public void setValue(double real, double imag) 
	{
		this.real = real;
		this.imag = imag;
	}

	@Override
	public String toString() {
		return "(" + real + ", " + imag + "i)";
	}
	
	public boolean isReal() 
	{
		if(imag == 0) 
		{
			return true;
		}
		return false;
	}
	
	public boolean isImag() 
	{
		if(real == 0) 
		{
			return true;
		}
		return false;
	}
	
	public boolean equals(double real, double imag) 
	{
		if ((this.real == real) && (this.imag == imag)) 
		{
			return true;
		}
		return false;
	}
	
	public boolean equals(MyComplex another) 
	{
		if ((this.real == another.real) && (this.imag == another.imag)) 
		{
			return true;
		}
		return false;
	}
	
	public double magnitude() 
	{
		return Math.sqrt((real * real) + (imag * imag));
	}
	
	public double argument() 
	{
		return Math.atan2(imag, real);
	}
	
	public MyComplex add(MyComplex right) 
	{
		this.real += right.getReal();
		this.imag += right.getImag();
		return this;
	}
	
	public MyComplex addNew(MyComplex right) 
	{
		MyComplex temp = new MyComplex();
		temp.setReal(real + right.getReal());
		temp.setImag(imag + right.getImag());
		return temp;
	}
	
	public MyComplex subtract(MyComplex right) 
	{
		this.real -= right.getReal();
		this.imag -= right.getImag();
		return this;
	}
	
	public MyComplex subtractNew(MyComplex right) 
	{
		MyComplex temp = new MyComplex();
		temp.setReal(real - right.getReal());
		temp.setImag(imag - right.getImag());
		return temp;
	}
	
	public MyComplex multiply(MyComplex right) 
	{
		this.real = real * right.getReal() - imag * right.getImag();
		this.imag = real * right.getImag() + right.getReal() * imag;
		return this;
	}
	
	public MyComplex divide(MyComplex right) 
	{
		real = (real * right.getReal() - imag * right.getImag()) / (Math.pow(right.getReal(), 2.0) + Math.pow(right.getImag(), 2.0));
		imag = (right.getReal() * imag - real * right.getImag()) / (Math.pow(right.getReal(), 2.0) + Math.pow(right.getImag(), 2.0));
		return this;
	}
}
