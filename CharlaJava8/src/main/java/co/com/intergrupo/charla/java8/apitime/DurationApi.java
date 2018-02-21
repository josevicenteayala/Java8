package co.com.intergrupo.charla.java8.apitime;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationApi {

	public static void main(String[] args) {
		Duration duration = Duration.ofHours(6);
		System.out.println("duration "+duration);
		System.out.println("duracion 24 horas "+duration.multipliedBy(5));
		System.out.println("duracion mas 30 minutos "+duration.plusMinutes(30));
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("fecha y hora actual "+localDateTime);
		System.out.println("fecha y hora actual + duracion "+localDateTime.plus(duration));
	}

}
