package free_money;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {
	public static void store(Customer m) {
		//Customer cc=new Customer("Cody", 100);
		
		try(FileOutputStream fos=new FileOutputStream("percist.txt", true);
				ObjectOutputStream bos=new ObjectOutputStream(fos);){
			bos.writeObject(m);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
