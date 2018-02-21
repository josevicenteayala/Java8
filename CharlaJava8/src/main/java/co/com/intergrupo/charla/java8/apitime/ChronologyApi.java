package co.com.intergrupo.charla.java8.apitime;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.JapaneseDate;
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
	}

}
