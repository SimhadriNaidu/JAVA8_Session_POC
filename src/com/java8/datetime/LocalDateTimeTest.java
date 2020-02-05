package com.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class LocalDateTimeTest {

	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime.toInstant(ZoneOffset.ofHoursMinutes(05, 30)));
		
		
		LocalDateTime dateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(dateTime2);
		
		//Convert String to Date
		LocalDateTime dateTime3 = LocalDateTime.parse("2020-02-01T15:43:20.658");
		System.out.println(dateTime3);
		
		System.out.println(LocalDateTime.MAX);
		
		System.out.println(LocalDateTime.now().getHour());
	}

}
