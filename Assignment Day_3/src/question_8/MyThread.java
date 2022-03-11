package question_8;

public class MyThread {
	@Override
	public void run() {
		Thread t= Thread.currentThread();
		System.out.println("Priority of "+t.getName()+" is "+t.getPriority());
	}
}


