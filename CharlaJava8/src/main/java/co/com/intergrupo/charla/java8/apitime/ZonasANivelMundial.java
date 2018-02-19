package co.com.intergrupo.charla.java8.apitime;

import java.time.Instant;
import java.time.ZoneId;

public class ZonasANivelMundial {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println(instant);	
		
		//ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
	}

}
