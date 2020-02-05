package com.java8.methodreferences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Naidu");
		list.add("Ram");
		list.add("Raju");
		list.add("Mohan");

		for (String s : list) {

			System.out.println(s);

		}
		System.out.println(" ");
		//
		list.stream().map(String::toUpperCase).forEach(e -> System.out.println(e));
		System.out.println(" ");
		list.stream().forEach(System.out::println);
		

	}

}
