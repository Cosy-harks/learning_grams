package eg1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Locale;

public class TimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld1 = LocalDate.now();
		System.out.println(ld1);

		LocalDate ld2 = LocalDate.parse("10.10.2010", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		System.out.println(ld2);
		
		ld2=ld2.plusYears(5);// add some time
		System.out.println(ld2);
		
		Period p = Period.between(ld2, ld1);//LocalDate.now();
		System.out.println("Years "+p.getYears());
		System.out.println("Months "+p.getMonths());
		System.out.println("Days "+p.getDays());
		
		System.out.println(ChronoUnit.DAYS.between(ld2, ld1));
		
		System.out.println(Locale.CHINA.getDisplayLanguage());
		for(Locale l:Locale.getAvailableLocales()) {
			System.out.println(l);
		}
		System.out.println();
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.plusDays(234782346l));
		System.out.println(ldt.until(LocalDateTime.now(), Period.ofDays(1).getUnits().get(0)));
		
		// Explore LocalTime, LocalDateTime, Zone, Locale
	}

}
