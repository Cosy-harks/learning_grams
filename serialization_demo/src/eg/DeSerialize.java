package eg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialize {
	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("percist.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);){
			CreditCard cc=(CreditCard) ois.readObject();
			System.out.println("deserialized");
			System.out.println(cc);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
