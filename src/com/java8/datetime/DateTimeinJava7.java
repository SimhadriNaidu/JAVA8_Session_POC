package com.java8.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTimeinJava7 {

	public static void main(String[] args) throws ParseException {
		
		//before  java 1.8 date time
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Before Java 1.8 Date Time :: "+dateFormat.format(date));
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println("Before Java 1.8 Date Time :: "+dateFormat2.format(cal.getTime()));
		
		// Difference b/w two dates in before Java 1.8
		String dateBeforeString = "31 01 2014";
		String dateAfterString = "02 02 2014";
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		Date firstDate = myFormat.parse(dateBeforeString);
		Date secondDate = myFormat.parse(dateAfterString);
		long diff = secondDate.getTime() - firstDate.getTime();

		System.out.println("Before Java 1.8 No.of B/W Days: " + diff / 1000 / 60 / 60 / 24);
		
		//After Java 1.8
		//24-May-2017, change this to your desired Start Date
		LocalDate dateBefore = LocalDate.of(2019, Month.MAY, 24);
		// 29-July-2019, change this to your desired End Date
		LocalDate dateAfter = LocalDate.of(2019, Month.MAY, 29);
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		System.out.println("In Java 1.8 No.of B/W Days:"+noOfDaysBetween);
		
		

		// Convert String to Date before Java 1.8
		String sDate1="31/01/2020";  
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    System.out.println("Convert String to Date before Java 1.8 :: "+date1);  
		
		// Convert String to Date java 1.8
		LocalDate dateTime3 = LocalDate.parse("2020-02-05");
		System.out.println("Convert String to Date after Java 1.8 :: "+dateTime3);

	
		
		//DateTime Formatter in java 1.8
		DateTimeFormatter oldPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss ");
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("Local Date Time in Java 1.8 :: "+datetime);
		String output = datetime.format(newPattern);
		 System.out.println("Local Date Time in new format (java 8) : " + output);
		
	}

}
