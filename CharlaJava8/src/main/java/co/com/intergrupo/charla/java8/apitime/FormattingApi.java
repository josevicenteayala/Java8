package co.com.intergrupo.charla.java8.apitime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormattingApi {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("d M, yyyy, hh:mm:ss:S");
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd MM, yyyy, hh:mm:ss:S");
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd MMM, yyyy, hh:mm:ss:S");
		DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("dd MMMM, yyyy, hh:mm:ss:S");
		System.out.println("dateTimeFormatter1 "+localDateTime.format(dateTimeFormatter1));
		System.out.println("dateTimeFormatter2 "+localDateTime.format(dateTimeFormatter2));
		System.out.println("dateTimeFormatter3 "+localDateTime.format(dateTimeFormatter3));
		System.out.println("dateTimeFormatter4 "+localDateTime.format(dateTimeFormatter4));
		
	}

}
