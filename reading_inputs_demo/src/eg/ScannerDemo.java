package eg;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println(name);
		System.out.println("Enter Age");
		int age =sc.nextInt();
		System.out.println("Enter Salary");
		double sal=sc.nextDouble();
		System.out.println("Gender m/f/o");
		char gender=sc.next().charAt(0);
		System.out.println("Destination?");
		String dest=sc.nextLine();
		System.out.println("Hello " + name);
		System.out.println("Age " + age);
		System.out.println("Salary " + sal);
		System.out.println("Gender " + gender);
		System.out.println("Destination " + dest);
		
	}

}
