package question_3;

public class MyRunnable {
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}
	}

	public void start(MyRunnable r) {
		new Thread(r).start();
		
	}
	
//	public void startThread() {
//		Thread t=new Thread();
//		t.start();
//	}


}
