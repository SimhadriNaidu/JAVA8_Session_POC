package com.java8.pre.funtionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {

	public static void main(String[] args) {

		BiFunction<String, String, String> function1 = (s1, s2) -> {
			String s3 = s1 + s2;
			return s3;
		};
		System.out.println(function1.apply("Nisum", ".com"));

		BiFunction<Integer, Integer, Integer> function2 = (a, b) -> a + b;
		System.out.println(function2.apply(100, 200));

		BiFunction<Integer, Integer, Integer> function3 = (a, b) -> a + b;
		Function<Integer, Integer> function4 = (n) -> n * n;

		// Using andThen()
		System.out.println(function3.andThen(function4).apply(5, 3));
		System.out.println(function3.andThen(function4).apply(12, 2));

	}

}
