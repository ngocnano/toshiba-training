package part3;

public class MyDate {
	
	private int year;
	public int month;
	public int day;
	
	// Month's name – for printing
	private String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
		                          "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
	// Number of days in each month (for non-leap years)
	private int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
	// Day of week – for printing
	private String[] strDayOfWeek = {"Monday","Tuesday","Wednesday","Thursday",
					                 "Friday","Saturday","Sunday"};
	
	// Returns true if the given year is a leap year
	public boolean isLeapYear(int year) 
	{
		if (((year % 4) == 0) && (((year % 100) != 0))) 
		{
			return true;
		}
		else if ((year % 400) == 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	// Return true if the given year, month, day is a valid date
	// year: 1-9999
	// month: 1(Jan)-12(Dec)
	// day: 1-28|29|30|31. The last day depends on year and month
	public boolean isValidDate(int year, int month, int day) 
	{
		int numberDay = daysInMonths[month - 1];
		if (isLeapYear(year) == true) 
		{
			if (month == 2) 
			{
				numberDay++;
			}
		}
		
		if ((month < 0) || (month > 12)) 
		{
			return false;
		}
		
		if ((day < 0) || (day > 31)) 
		{
			return false;
		}
		
		if (day > numberDay) 
		{
			
			return false;
		}
		else 
		{
			return true;
		}

	}
	
	// Return the day of the week, 0:Sun, 1:Mon, ..., 6:Sat
	public int getDayOfWeek(int year, int month, int day) 
	{
		int JMD;
		JMD = (day + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5) +
		      (365 * (year + 4800 - ((14 - month) / 12))) +
		      ((year + 4800 - ((14 - month) / 12)) / 4) - 
		      ((year + 4800 - ((14 - month) / 12)) / 100) + 
		      ((year + 4800 - ((14 - month) / 12)) / 400)  - 32045) % 7;
		
		return (JMD + 1);
	}
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}	
	
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		String print = new String();
		print  = print.concat(strDayOfWeek[getDayOfWeek(year, month, day) - 1]);
		print  = print.concat(" ");
		print  = print.concat(Integer.toString(day));
		print  = print.concat(" ");
		print  = print.concat(strMonths[month - 1]);
		print  = print.concat(" ");
		print  = print.concat(Integer.toString(year));
		return print;
	}	
		
	public MyDate nextDay() 
	{
		if(isLeapYear(year)) 
		{
			daysInMonths[1] = 29;
		}
		else 
		{
			daysInMonths[1] = 28;
		}
		day++;
		if (day > daysInMonths[month - 1]) 
		{
			day = 1;
			month++;
		}
		if(month > 12) 
		{
			month = 1;
			year++;
		}
		return this;
	}
	
	public MyDate nextMonth() 
	{
		month++;
		if(month > 12) 
		{
			month = 1;
			year++;
		}
		return this;
	}
	public MyDate nextYear() 
	{
		year++;
		return this;
	}
	
	public MyDate previousDay() 
	{
		if(isLeapYear(year)) 
		{
			daysInMonths[1] = 29;
		}
		else 
		{
			daysInMonths[1] = 28;
		}
		day--;
		if (day <= 0) 
		{
			month--;
			if(month <= 0) 
			{
				month = 12;
				year--;
			}
			day = daysInMonths[month - 1];	
		}
		
		return this;
	}

	public MyDate previousMonth() 
	{
		month--;
		if(month <= 0) 
		{
			month = 12;
			year--;
		}
		if (day > daysInMonths[month-1]) 
		{
			day = daysInMonths[month-1];
		}
		return this;
	}
	public MyDate previousYear() 
	{
		year--;
		return this;
	}
}
