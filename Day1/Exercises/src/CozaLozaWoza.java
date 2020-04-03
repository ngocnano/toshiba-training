
public class CozaLozaWoza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int min=1,max=110,test =1,cout=1;
       
       
       for(int i=min;i<=max;i++) {
    	   test =1;
    	   if(i%3 == 0) {
    		   test = 0;
    		   System.out.print("Coza");
    	   }
    	   if(i%5 == 0) {
    		   test = 0;
    		   System.out.print("Loza");
    	   }
    	   if(i%7 == 0) {
    		   test = 0;
    		   System.out.print("Woza");
    	   }
    	   if(test == 1) System.out.print(i);
    	   System.out.print(" ");
    	   if(cout==11) { 
    	   System.out.println("");
    	   cout=0;
           }
    	   cout++;
       }   
	}

}
