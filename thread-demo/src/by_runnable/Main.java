package by_runnable;

public class Main {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new RunThread(), "run-1");
		Thread t2 = new Thread(new RunThread(), "run-2");
		Thread t3 = new Thread(new RunThread(), "run-3");
		Thread t4 = new Thread(new RunThread(), "run-4");
		Thread t5 = new Thread(new RunThread(), "run-5");
		Thread t6 = new Thread(new RunThread(), "run-6");
		
		t1.start();
		t2.start();

		t3.start();

		t4.start();

		t5.start();

		t6.start();
		
		
//		for(int i = 0; i < 4;i++) {
//			System.out.println("Printing from thread - "+Thread.currentThread().getName());
//			try {
//				Thread.currentThread().sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		try {
			t1.join();
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
		}
		System.out.println("Main ends");
	}
}
