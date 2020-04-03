
public class DateUtil {
	// Month's name – for printing
	public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
	                                    "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	
	// Number of days in each month (for non-leap years)
	public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	// Day of week – for printing
	public static String[] strDayOfWeek = {"Monday","Tuesday","Wednesday","Thursday",
				                           "Friday","Saturday","Sunday"};
		
	
	// Returns true if the given year is a leap year
		public static boolean isLeapYear(int year) 
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
	public static boolean isValidDate(int year, int month, int day) 
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
	public static int getDayOfWeek(int year, int month, int day) 
	{
		int JMD;
		JMD = (day + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5) +
		      (365 * (year + 4800 - ((14 - month) / 12))) +
		      ((year + 4800 - ((14 - month) / 12)) / 4) - 
		      ((year + 4800 - ((14 - month) / 12)) / 100) + 
		      ((year + 4800 - ((14 - month) / 12)) / 400)  - 32045) % 7;
		
		return (JMD + 1);
	}
	
	// Return String "xxxday d mmm yyyy" (e.g., Wednesday 29 Feb 2012)
	public static String printDate(int year, int month, int day) 
	{
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
	
	public static String toString(int year, int month, int day) 
	{
		return printDate(year, month, day);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLeapYear(1900)); // false
		System.out.println(isLeapYear(2000)); // true
		System.out.println(isLeapYear(2011)); // false
		System.out.println(isLeapYear(2012)); // true
		System.out.println(isValidDate(2012, 2, 29)); // true
		System.out.println(isValidDate(2011, 2, 29)); // false
		System.out.println(isValidDate(2099, 12, 31)); // true
		System.out.println(isValidDate(2099, 12, 32)); // false
		System.out.println(getDayOfWeek(1982, 4, 24)); // 6:Sat
		System.out.println(getDayOfWeek(2000, 1, 1)); // 6:Sat
		System.out.println(getDayOfWeek(2054, 6, 19)); // 5:Fri
		System.out.println(getDayOfWeek(2012, 2, 17)); // 5:Fri
		System.out.println(toString(2012, 2, 14)); // Tuesday 14 Feb 2012

	}

}
