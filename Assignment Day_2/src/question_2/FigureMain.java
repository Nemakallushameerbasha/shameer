package question_2;

public class FigureMain {
	public static void main(String[] args) {
		Figure triangle=new Traingle(20,30);
		System.out.println(triangle.area());
		
		
		Figure rectangle=new Rectangle(10,100);
		System.out.println(rectangle.area());
	}

}
