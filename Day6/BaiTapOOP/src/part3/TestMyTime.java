package part3;

public class TestMyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTime m1 = new MyTime(23,59,59);
		System.out.println(m1.nextSecond());
		System.out.println(m1.nextMinute());
		System.out.println(m1.nextHour());
		System.out.println(m1.previousSecond());
		System.out.println(m1.previousMinute());
		System.out.println(m1.previousHour());
		
	}

}
