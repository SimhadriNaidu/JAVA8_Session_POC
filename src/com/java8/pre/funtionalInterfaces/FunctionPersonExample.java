package com.java8.pre.funtionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionPersonExample {

	public static void main(String[] args) {
		Predicate<Person> predicate = s -> s.getAge() > 30;
		Function<List<Person>, Map<String, Integer>> personFunction = (persons -> {

			Map<String, Integer> map = new HashMap<String, Integer>();
			persons.forEach((person -> {

				if (predicate.test(person)) {
					map.put(person.getName(), person.getAge());

				}

			}));
			return map;
		});
		System.out.println(personFunction.apply(PersonData.getAllPersons()));
	}

}
