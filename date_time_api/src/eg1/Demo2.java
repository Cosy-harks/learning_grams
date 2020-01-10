package eg1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12.10.2000"; //dd.MM.yyyy
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		if(s.matches("[0-9]{2}.[0-9]{2}.[0-9]{4}")) {
			
			sdf.setLenient(false);
			try {
				Date d = sdf.parse(s);
				System.out.println("Date received " + d);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}else {
			System.out.println("Invalid");
		}
	}
}
//Pre java8 Calendar - GregorianCalendar