package co.com.intergrupo.charla.java8.apitime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeApi {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime "+localDateTime);
		
		LocalDateTime localDateTime2 = LocalDateTime.of(2018, Month.OCTOBER,31,10,30,40,50);
		System.out.println(localDateTime2);
		
		System.out.println("adicion o resta de tiempo "+localDateTime.plusDays(1).minusHours(10));
		
		System.out.println("Indicar un día específico: "+localDateTime.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
		
		System.out.println(localDateTime);
	}

}
