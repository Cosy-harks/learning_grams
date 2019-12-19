package eg1;

import java.io.FileNotFoundException;

public class Presenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Opener o=new Opener();
		try {
			o.open("hello.txt");
		}catch(FileNotFoundException e) {
			System.out.println("whoops");
		}
	}

}
