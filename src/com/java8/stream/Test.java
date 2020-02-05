package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

	}

	public void filterTest() {
		List<String> customers = Arrays.asList("Rama", "Uday", "Rajesh", "sriharsha", "Manjil");
		List<String> filteredCustomers = customers.stream().filter(c -> c.startsWith("R")).collect(Collectors.toList());
		filteredCustomers.forEach(System.out::println);
	}

	public void mapTest() {
		List<String> customers = Arrays.asList("Rama", "Uday", "Rajesh", "sriharsha", "Manjil");
		List<String> mappedCustomers = customers.stream().map(c -> c.toUpperCase()).collect(Collectors.toList());
		mappedCustomers.forEach(System.out::println);
	}

	public void flatMapTest() {

	}

}
