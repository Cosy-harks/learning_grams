package free_money;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeSerialize {

	public static Customer data(){
		// TODO Auto-generated method stub
		try(FileInputStream fis=new FileInputStream("percist.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);){
			
			Customer cc=(Customer) ois.readObject();
			System.out.println("deserialized");
			System.out.println(cc);
			return cc;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return null;
	}

}
