import java.util.Scanner;

public class Dec2Hex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String resul    = new String();
		System.out.print("Enter a decimal number: ");
		int decimal = scanner.nextInt();
		
		char hexa[] = {'0','1','2','3','4','5','6','7',
				       '8','9','A','B','C','D','E','F'};
		int temp = 0;
		while(decimal >= 16) 
		{
			temp = decimal % 16;
			resul = resul.concat(Character.toString(hexa[temp]));
			decimal = decimal / 16;
		}
		resul = resul.concat(Character.toString(hexa[decimal]));
		
		System.out.print("The equivalent hexadecimal number is ");
		for (int i = (resul.length() - 1); i >= 0; i--) 
		{
			System.out.print(resul.charAt(i));
		}
        scanner.close();
	}

}
