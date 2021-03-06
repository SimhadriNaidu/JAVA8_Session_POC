package com.java8.pre.funtionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {

		BiPredicate<String, String> predicate = (s1, s2) -> (s1.equals(s2));

//		System.out.println(predicate.test("Nisum", "Nisum"));
//		System.out.println(predicate.test("JAVA", "Linux"));

		BiPredicate<Long, Long> predicate1 = (x, y) -> x > y;
		BiPredicate<Long, Long> predicate2 = (x, y) -> x == y;

		// Using and()
		System.out.println(predicate1.and(predicate2).test(5l, 5l));

		// Using or()
		System.out.println(predicate1.or(predicate2).test(6l, 5l));

		// Using negate()
		System.out.println(predicate1.negate().test(8l, 1l));

	}

}
