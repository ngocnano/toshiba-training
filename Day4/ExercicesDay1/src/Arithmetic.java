import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner  = new Scanner(System.in);
        System.out.print("java Arithmetic ");
        String input     = scanner.nextLine();
        String outPut[]  = new String [3];
        int number1 = 0;
        int number2 = 0;
        char oprerator;
        int result  = 0;
        int count   = 0;
        int begin   = 0;
    	int end     = 0;
        for (int i = 0; i < input.length(); i++) 
        {
        	
        	if (input.charAt(i) == ' ') 
        	{ 
        		end   = i;
        		outPut[count] = input.substring(begin,end);
        		count++;
        		begin = end + 1;
        	}
        }
        outPut[2] = input.substring(begin);
        
       number1 = Integer.parseInt(outPut[0]);
       number2 = Integer.parseInt(outPut[1]);
       oprerator = outPut[2].charAt(0);
       
       switch (oprerator) 
       {
       case 42 : result = number1 * number2; break;
       case 43 : result = number1 + number2; break;
       case 45 : result = number1 - number2; break;
       case 47 : if(number2 != 0) 
                 {
    	             result = number1 / number2; break;
                 }
                 else 
                 {
                	 System.out.println("Eror"); break;
                 }  
       
       default : System.out.println("Eror");
	   }
       System.out.println(outPut[0] + outPut[2] + outPut[1] + " = " + result);
       scanner.close();
	}

}
