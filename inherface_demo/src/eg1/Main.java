package eg1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nAccessing MyClass");
		MyClass m = new MyClass();
		m.hello();
		m.hi();
		m.local();
		m.common();
		System.out.println(m.hashCode());
		
		System.out.println("\nAccessing with MyInterface");
		MyInterface i = new MyClass();
		i.hello();
		i.hi();
		i.common();
		//i.local();
		System.out.println(i.hashCode());
		
		System.out.println("\nAccessing with MyInterface");
		Interface2 i2 = new MyClass();
		i2.drive();
		i2.stop();
		i2.common();
		//i.local();
		System.out.println(i2.hashCode());
		
	}

}
