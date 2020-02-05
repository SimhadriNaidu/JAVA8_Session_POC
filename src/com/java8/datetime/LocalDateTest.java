package com.java8.datetime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("Local Date is :: " + date);

	}

}

//		//create an instace by using factory "of" and "parse"
//		System.out.println("Using Factory *of* method :: "+date.of(2020, 2, 7));
//		System.out.println("Covert String to Date ::"+date.parse("2020-02-20"));
//		System.out.println("Add no .of days ::"+date.plus(3, ChronoUnit.DAYS));
//		System.out.println("Get Day of the Week ::"+date.getDayOfWeek()); 
//		System.out.println("Get Day of the Month ::"+date.getDayOfMonth()); 
//		System.out.println("Get Day of the Year ::"+date.getDayOfYear());
//		System.out.println("Is it Leap Year ::"+date.isLeapYear());
//		
//		System.out.println("Is before date ::"+date.isAfter(date.of(2020, 2, 7)));
//		
//		//24-May-2017, change this to your desired Start Date
//		LocalDate dateBefore = LocalDate.of(2019, Month.MAY, 24);
//		// 29-July-2019, change this to your desired End Date
//		LocalDate dateAfter = LocalDate.of(2019, Month.MAY, 29);
//		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
//		System.out.println(dateAfter +" to " +dateAfter+" B/w "+noOfDaysBetween+" days");
//		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
//		LocalDate dateFormat = LocalDate.parse("23 01 2020",formatter);
//		System.out.println("Date Foramtting :: "+dateFormat);
//		
//		
//		Clock clock = Clock.systemDefaultZone();
//		LocalDate date2 = LocalDate.now(clock );
//		System.out.println(date2);
//		
//
//		
//		ZoneId zoneId = ZoneId.of("Asia/Kolkata");
//		LocalDate date3 = LocalDate.now(zoneId );
//		System.out.println(date3);
