package lambda_functional_java8;

//functional interface
@FunctionalInterface
public interface Hello {
	void hello();
	//void hey();//no longer functional interface
	
	// from java 8
	public static void hi() { //not modifiable
		System.out.println("Hi from static method from java8");
	}
	
	default void iAmDefault() { // child modifiable
		System.out.println("Default method from java8");
	}
}
