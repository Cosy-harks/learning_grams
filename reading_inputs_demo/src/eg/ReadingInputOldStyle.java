package eg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingInputOldStyle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");
		String name=br.readLine();
		System.out.println("Enter Age");
		int age=Integer.parseInt(br.readLine());

		System.out.println("Hello " + name);
		System.out.println("Age " + age);
	}

}
