package eg;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard cc=new CreditCard(123456788900l, "Cody", "ABuank", 100);
		
		try(FileOutputStream fos=new FileOutputStream("percist.txt");
				ObjectOutputStream bos=new ObjectOutputStream(fos);){
			bos.writeObject(cc);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
