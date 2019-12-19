package byte_demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInByteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis=new FileInputStream("data.txt");
				BufferedInputStream bis=new BufferedInputStream(fis);){
			System.out.println("Bytes available before "+bis.available());
			StringBuilder sb=new StringBuilder();
			while(bis.available()!=0) {
				sb.append((char)bis.read());
			}
			System.out.println(sb);
			System.out.println("Bytes available aft "+bis.available());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		}
	}

}
