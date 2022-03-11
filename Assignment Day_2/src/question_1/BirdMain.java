package question_1;

public class BirdMain {
	public static void main(String[] args) {
		Parrot parrot=new Parrot("parrot1");
		System.out.println(parrot.fly());
		
		Eagle eagle=new Eagle("eagle1");
		System.out.println(eagle.fly());
		
		Duck duck=new Duck("duckky");
		System.out.println(duck.fly());
		
	}

}
