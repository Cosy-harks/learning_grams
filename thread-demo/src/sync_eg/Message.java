package sync_eg;

public class Message  {
	String message1;
	String message2;
	
	public Message(String message1, String message2) {
		super();
		this.message1 = message1;
		this.message2 = message2;
		Printer.printMessage(this);
	}
	
}
