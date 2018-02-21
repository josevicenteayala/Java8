package co.com.intergrupo.charla.java8.apitime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class DurationApi {

	public static void main(String[] args) {
		//duracion();
		Period periodInMonths = Period.ofMonths(2);
		Period periodInDays = Period.ofDays(2);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Fecha Actual: "+localDateTime);
		System.out.println("Auemnto en meses: "+localDateTime.plus(periodInMonths));
		System.out.println("Aumento en dias: "+localDateTime.plus(periodInDays));
		System.out.println("Aumento en dias: "+localDateTime.plus(periodInDays.plusDays(2)));
		
	}

	public static void duracion() {
		Duration duration = Duration.ofHours(6);
		System.out.println("duration "+duration);
		System.out.println("duracion 24 horas "+duration.multipliedBy(5));
		System.out.println("duracion mas 30 minutos "+duration.plusMinutes(30));
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("fecha y hora actual "+localDateTime);
		System.out.println("fecha y hora actual + duracion "+localDateTime.plus(duration));
	}

}
