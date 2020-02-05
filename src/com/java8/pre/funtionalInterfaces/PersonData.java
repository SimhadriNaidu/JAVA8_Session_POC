package com.java8.pre.funtionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class PersonData {

	public static List<Person> getAllPersons(){
		Person person = new Person("Ram", 30, "Hyderabad");
		Person person2 = new Person("Raju", 35, "Chile");
		Person person3 = new Person("Krish", 40, "US");
		Person person4 = new Person("Anna", 25, "UP");
		
		 List<Person> persons = Arrays.asList(person,person2,person3,person4);
		
		return persons;
	}
}
