package by_thread_class;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		Thread t = Thread.currentThread();
		t.setPriority(8);
		t.setName("my_main");
		System.out.println(t);
//		System.out.println(8/0);
		
		MyThread t1 = new MyThread();
		t1.setName("t1");
		MyThread t2 = new MyThread();
		t2.setName("t2");
		MyThread t3 = new MyThread();
		t3.setName("t3");
		MyThread t4 = new MyThread();
		t4.setName("t4");
		MyThread t5 = new MyThread();
		t5.setName("t5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
