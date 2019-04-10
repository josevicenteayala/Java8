package co.com.intergrupo.charla.java8.apitime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class LocalDateApi {

	public static void main(String[] args) {
		
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
		
		System.out.println(LocalDate.of(2019, Month.APRIL, 01).plusWeeks(1).plusYears(1));
	}
}
