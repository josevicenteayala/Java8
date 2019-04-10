package co.com.intergrupo.charla.java8.apitime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeAPI {

	public static void main(String[] args) {
		System.out.println(LocalTime.now());
		LocalTime localTime = LocalTime.now();
		
		System.out.println(localTime);
		System.out.println("La hora actual es mayor a las 4? "+(localTime.getHour()>4));
		
		LocalTime localTime2 = LocalTime.of(10, 35,40,99988888);
		System.out.println(localTime2);
		
		System.out.println("La hora personalizada es mayor a la hora actual? "+(localTime2.isAfter(localTime)));
		
		System.out.println("Sumar horas: "+localTime.plusHours(5));
		System.out.println("Operaciones con horas y minutos: "+localTime.plusHours(5).minusMinutes(10));
		
		System.out.println("Modificando los nanosegundos: "+localTime.withNano(0));
		
		System.out.println("Truncamiento de alguna unidad de tiempo "+localTime.truncatedTo(ChronoUnit.SECONDS));
		
		System.out.println(localTime);		
	}

}
