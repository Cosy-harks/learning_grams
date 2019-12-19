package byte_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharDemo {
	public static void main(String[] args) {
		try(FileWriter fw=new FileWriter("char.txt");
				BufferedWriter bw=new BufferedWriter(fw);){
			bw.write("Hello this evening\n");
			bw.write("no convertions needed\n");
			bw.write("goodbuy");
			System.out.println("Info written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
