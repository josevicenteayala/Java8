package co.com.intergrupo.charla.java8.apitime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateApi {

	public static void main(String[] args) {
		//pruebasLocalDate();
		//pruebasLocalTime();
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		LocalDateTime localDateTime2 = LocalDateTime.of(2018, Month.OCTOBER,31,10,30,40,50);
		System.out.println(localDateTime2);
		
		System.out.println("adicion o resta de tiempo "+localDateTime.plusDays(1).minusHours(10));
		
		System.out.println("Indicar un día específico: "+localDateTime.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
		
		System.out.println(localDateTime);
	}

	public static void pruebasLocalTime() {
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

	public static void pruebasLocalDate() {
		LocalDate fechaInicial = LocalDate.now();
		LocalDate fechaFinal = LocalDate.now();
		if(fechaFinal.isAfter(fechaInicial)) {
			System.out.println("la fecha "+fechaFinal+"  es mayor a la fecha "+fechaInicial);
		}else {
			System.out.println("la fecha "+fechaFinal+"  es igual a la fecha "+fechaInicial);
		}
		//bisiesto
		System.out.println("Este año es Bisiesto? "+fechaFinal.isLeapYear());
		System.out.println("Cantidad de días del mes "+fechaFinal.lengthOfMonth());
		
		LocalDate fechaAnterior = LocalDate.of(2017, Month.JULY, 9);
		System.out.println(fechaAnterior);
		
		System.out.println("fecha aumentada "+fechaInicial.plusMonths(1).minusDays(1));
		System.out.println("fecha con dia del mes propuesto: "+fechaInicial.withDayOfMonth(1));
		System.out.println("fecha con mes propuesto: "+fechaInicial.withMonth(12));
		System.out.println("fecha con mes propuesto de otra forma: "+fechaInicial.with(Month.APRIL));
		
		/********temas mas complejos*******/
		System.out.println("ultimo dia del mes "+fechaInicial.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println("otro día de la semana "+fechaInicial.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)));
		System.out.println("otro día de la semana "+fechaInicial.with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY)));
		
		System.out.println(fechaInicial);
	}

}
