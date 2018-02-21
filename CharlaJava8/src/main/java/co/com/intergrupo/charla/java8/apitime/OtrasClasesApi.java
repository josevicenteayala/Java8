package co.com.intergrupo.charla.java8.apitime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;

public class OtrasClasesApi {

	public static void main(String[] args) {
		System.out.println(Year.now());
		System.out.println(Year.isLeap(2018));
		
		LocalDate localDate = Year.of(2017).atMonth(Month.APRIL).atDay(14);
		System.out.println("Fecha conformada:  "+localDate);
		LocalDateTime localDateTime = localDate.atTime(2,3,0,45);
		System.out.println("Fecha y hora conformada:  "+localDateTime);
		
		OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(2));
		System.out.println("OffSetDateTime "+offsetDateTime);
		
		ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.of("Europe/London"));
		System.out.println("zonedDateTime London: "+zonedDateTime);
		
		ZonedDateTime zonedDateTimeParis = localDate.atStartOfDay(ZoneId.of("Europe/Paris"));
		System.out.println("zonedDateTime Paris: "+zonedDateTimeParis);
			
		
		Instant instant = Instant.now(Clock.systemDefaultZone());
		System.out.println("instant "+instant);
		
		Temporal temporalDate = LocalDate.now();
		System.out.println("Temporal Date:  "+temporalDate);
		
		Temporal temporalLocalDateTime = LocalDateTime.now();
		System.out.println("Temporal2 Date:  "+temporalLocalDateTime);
	}

}
