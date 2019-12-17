package mypack;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		iAmStatic();
		Demo.hey();
		
		HelloWorld h = new HelloWorld();
		h.iAmNotStatic();
		
		Demo d = new Demo();
		d.iNotStatic();
		
		//Not kept in memory
		new Demo().iNotStatic(); //inline object creation
		
	}
	
	public static void iAmStatic() {
		System.out.println("Static method of HelloWorld class");
	}

	public void iAmNotStatic() {
		System.out.println("Non static Method of HelloWorld");
	}
}
