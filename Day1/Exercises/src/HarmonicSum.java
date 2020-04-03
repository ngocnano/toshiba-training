
public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int max = 50000;
        double sumLR = 0.0;
        double sumRL= 0.0;
        double absDiff=0.0;
        for(int i=1;i<max;i++) {
        	sumLR+=1.0/i;
        }
        for(int i=max;i>=1;i--) {
        	sumRL+=1.0/i;
        }
        if(sumLR>sumRL) {
        	absDiff = sumLR - sumRL;
        } else { absDiff= sumRL- sumLR;}
        
        System.out.println("Sum from left to right "+ sumLR);
        System.out.println("Sum from right to left "+ sumRL);
        System.out.println("Absolute difference between the two sums "+ absDiff);
	}

}
