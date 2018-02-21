package co.com.intergrupo.charla.java8.apitime;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.chrono.ThaiBuddhistDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


/*Es una fabrica de fechas*/
public class ChronologyApi {

	public static void main(String[] args) {
		
		Locale locale = Locale.forLanguageTag("th-TH-u-ca-buddhist");
		Chronology chronology = Chronology.ofLocale(locale);
		System.out.println(chronology);
		
		ChronoLocalDate dateNow = chronology.dateNow();
		System.out.println(dateNow);
		
		JapaneseDate japaneseDate = JapaneseDate.now();
		System.out.println("Fecha en japones:  "+japaneseDate);

		ThaiBuddhistDate thaiBuddhistDate = ThaiBuddhistDate.now();
		System.out.println("Fecha en Buddhist: "+thaiBuddhistDate);
		
		MinguoDate minguoDate = MinguoDate.now();
		System.out.println("Fecha en minguo Date "+minguoDate);
		System.out.println("Fecha de minguo formateada "+minguoDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
		
		
	}

}
