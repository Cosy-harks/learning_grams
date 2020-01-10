package eg1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		
		/*SimpleDateFormat
		 * dd - date
		 * MM - month in two digits, MMM - short name, MMMM - whole name
		 * yy - last 2 yr digits, yyyy - full year
		 * hh - 12 hr
		 * HH - 24 hr
		 * mm - minutes
		 * ss - seconds
		 * EEE - day name short, EEEE - full day name
		 * a - AM/PM
		 * z/Z - zone & GMT
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM/yyyy/dd EEE HH:mm - hh:mm a z Z");
		System.out.println(sdf.format(d));
	}

}
