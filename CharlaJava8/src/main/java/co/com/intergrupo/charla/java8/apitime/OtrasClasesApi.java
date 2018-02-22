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
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.Temporal;
import java.util.Comparator;
import java.util.Set;

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
		
		ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.of("America/Bogota"));
		System.out.println("zonedDateTime London: "+zonedDateTime);
		
		ZonedDateTime zonedDateTimeParis = localDate.atStartOfDay(ZoneId.of("Europe/Paris"));
		System.out.println("zonedDateTime Paris: "+zonedDateTimeParis);
			
		
		Instant instant = Instant.now(Clock.systemDefaultZone());
		System.out.println("instant "+instant);
		
		Temporal temporalDate = LocalDate.now();
		System.out.println("Temporal Date:  "+temporalDate);
		
		Temporal temporalLocalDateTime = LocalDateTime.now();
		System.out.println("Temporal2 Date:  "+temporalLocalDateTime);
		
		System.out.println("-------------------------------------");
		imprimirZonas();
	}
	
	
	public static void imprimirZonas() {
        Instant instant = Instant.now();
        ZonedDateTime current = instant.atZone(ZoneId.systemDefault());
        System.out.printf("Current time is %s%n%n", current);
 
        System.out.printf("%10s %20s %13s%n", "Offset", "ZoneId", "Time");
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        //availableZoneIds.stream().forEach((System.out::println));
        
        
		availableZoneIds.stream()
            .map(ZoneId::of)
           .filter(zoneId -> {
                ZoneOffset offset = instant.atZone(zoneId).getOffset();
                return offset.getTotalSeconds() % (60 * 60) != 0;
            })
            .sorted(Comparator.comparingInt(zoneId -> {
				ZonedDateTime atZone = instant.atZone(zoneId);
				int totalSeconds = atZone.getOffset().getTotalSeconds();
				return totalSeconds;
			}))
            .forEach(zoneId -> {
                ZonedDateTime zdt = current.withZoneSameInstant(zoneId);
                System.out.printf("%10s %25s %10s%n", zdt.getOffset(), zoneId,
                    zdt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
            });		
	}

}
