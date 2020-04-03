
public class ExtractDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=123456;
        while(n>=10) {
        	int a=n%10;
        	System.out.print(a+" ");
        	n=n/10;
        }
        System.out.print(n+" ");
	}

}
