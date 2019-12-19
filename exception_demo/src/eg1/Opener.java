package eg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Opener {
	
	public void open(String Filename) throws FileNotFoundException {
		FileInputStream f=new FileInputStream(Filename);
	}
}
