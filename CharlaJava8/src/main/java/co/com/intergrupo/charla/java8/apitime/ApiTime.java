package co.com.intergrupo.charla.java8.apitime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class ApiTime {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		LocalDate localDate2 = LocalDate.of(1975, Month.JULY, 9);
		System.out.println(localDate2);
		LocalTime localTieme = LocalTime.now();
		System.out.println(localTieme);
		LocalTime localTime = LocalTime.now(ZoneId.of("Africa/Cairo"));
		System.out.println(localTime);
		
		String zonaColombiana = ZoneId.getAvailableZoneIds().stream().filter(zona->zona.contains("Bogota")).map(x->x).findFirst().get();
		ZoneId zonaLocal = ZoneId.of(zonaColombiana);
		LocalTime localTime2 = LocalTime.now(zonaLocal);
		System.out.println(localTime2);
		
		Instant instant = Instant.now(Clock.system(zonaLocal));
		System.out.println("instant "+instant);
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.HOUR));
		ZonedDateTime zoneDateTime = ZonedDateTime.now();
		System.out.println(zoneDateTime);
	}

}
