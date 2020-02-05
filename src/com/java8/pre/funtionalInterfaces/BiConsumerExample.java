package com.java8.pre.funtionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<Integer, String> consumer = (a, b) -> {
			System.out.println(a + b);
		};
		consumer.accept(5, " BiConsumerExample");

		BiConsumer<Integer, Integer> addition = (a, b) -> {
			System.out.println(a + b);
		};

		BiConsumer<Integer, Integer> subtraction = (a, b) -> {
			System.out.println(a - b);
		};
		// Using andThen()
		addition.andThen(subtraction).accept(10, 6);

	}

}
