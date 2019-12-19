package compiler_static_overload_demo;

public class Main {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(12.5f,  12.333f);
		c.add(2.222, 123.44553);
		c.add(11,  10, 5);
		System.out.println("(int, int, int, int)" + c.add(1, 2, 3, 4));
	}
}
