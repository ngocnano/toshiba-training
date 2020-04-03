package part2;

public class TestMyCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyCircle c1 = new MyCircle(2, 3, 3);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        c1.setCenterX(5);
        c1.setCenterY(6);
        c1.setRadius(4);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        
	}

}
