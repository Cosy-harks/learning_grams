package example;

public class Calculator {

	int a;
	int b;
	int c;
	
	
	//right-click->source->generate constructor using fields
	public Calculator(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Calculator(String name) {
		System.out.println("Hello " + name);
	}
	
	public Calculator(int a, int b) {
		this(); // constructor chaining - first line only
				//to initializes old parameters
				//then initialize new parameters
		this.a = a;//variable shadowing - same name
		this.b = b;
	}
	public Calculator() {
		System.out.println("Empty Constructor");
	}
	
	public int add() {
		return a+b;
	}
}
