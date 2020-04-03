package part3;

public class MyTime {
	
	private int hour;
	private int minute;
	private int second;
	
	public MyTime() 
	{
		
	}
	public MyTime(int hour, int minute, int second) 
	{
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) 
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	@Override
	public String toString() {
		return (hour + " : " + minute + " : " + second);
	}
	
	public MyTime nextSecond() 
	{
		second++;
		if (second >= 60) 
		{
			minute++;
			second = second - 60;
		}
		
		if (minute >= 60) 
		{
			hour++;
			minute = minute - 60;
		}
		
		if (hour >= 24) 
		{
			hour = hour - 24;
		}
		return this;
	}
	
	public MyTime nextMinute() 
	{
		minute++;
		if (minute >= 60) 
		{
			hour++;
			minute = minute - 60;
		}
		
		if (hour >= 24) 
		{
			hour = hour - 24;
		}
		return this;
	}
	
	public MyTime nextHour() 
	{
		hour++;
		if (hour >= 24) 
		{
			hour = hour - 24;
		}
		return this;
	}
	
	public MyTime previousSecond() 
	{
		second = second - 1;
		
		if (second < 0) 
		{
			minute--;
			second = 60 + second;
		}
		
		if (minute < 0) 
		{
			hour--;
			minute = 60 + minute;
		}
		
		if (hour < 0) 
		{
			hour = hour + 24;
		}
		return this;
	}
	
	public MyTime previousMinute() 
	{
		minute = minute - 1;
		
		if (minute < 0) 
		{
			hour--;
			minute = 60 + minute;
		}
		
		if (hour < 0) 
		{
			hour = hour + 24;
		}
		return this;
	}
	
	public MyTime previousHour() 
	{
		hour--;
		if (hour < 0) 
		{
			hour = hour + 24;
		}
		return this;
	}

}
