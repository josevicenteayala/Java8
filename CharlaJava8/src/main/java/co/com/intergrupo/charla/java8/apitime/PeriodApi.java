package co.com.intergrupo.charla.java8.apitime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodApi {

	public static void main(String[] args) {
		Period period = Period.ofDays(1);
		System.out.println(period);
		LocalDate startDate = LocalDate.now();
		LocalDate endDate = startDate.plusYears(10);
		
		performAnimalEnrichment(startDate, endDate, period);
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.of(date,time);
		LocalDate plusDate = date.plus(period);
		System.out.println("new date with plus period: "+plusDate);
		System.out.println("new date with plus period: "+date);
		System.out.println("new date time with plus period: "+dateTime);
		
	}

	private static void performAnimalEnrichment(LocalDate startDate, LocalDate endDate, Period period) {
		while (startDate.isBefore(endDate)) {
			System.out.println("give new toy: " + startDate);
			startDate = startDate.plus(period);
		}
	}

}
