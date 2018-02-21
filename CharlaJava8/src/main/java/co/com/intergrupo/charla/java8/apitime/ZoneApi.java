package co.com.intergrupo.charla.java8.apitime;

import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneApi {

	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("Europe/London");
		System.out.println(zoneId);
		
		ZonedDateTime zoneDateTime = ZonedDateTime.of(2018, Month.MARCH.getValue(),20,10,30,15,99,zoneId);
		System.out.println(zoneDateTime);
		
		System.out.println("Suma de días: "+zoneDateTime.plusDays(1));
		
		System.out.println("Suma horas: "+zoneDateTime.plusHours(1));
	}

}
