package sync_eg;

public class Printer {
	public synchronized static void printMessage(Message m) {
		System.out.println(m.message1);
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(m.message2);
	}
}

// Explore wait() notify() notifyAll()
