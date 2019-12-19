package byte_demo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutByteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		String s = "\nEndOfFile";
		
		try {
			fos=new FileOutputStream("data.txt", true);
			// TODO Auto-generated catch block
			bos=new BufferedOutputStream(fos);
			byte b[]=s.getBytes();
			bos.write(b);
			System.out.println("Info Written to file?");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
