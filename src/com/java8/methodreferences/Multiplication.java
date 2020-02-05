package com.java8.methodreferences;

import java.util.function.BiFunction;

//class Example {
//	public static int multiply(int a, int b) {
//		return a * b;
//	}
//}

public class Multiplication {
	
	public int multiply(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		
		Multiplication multiplication = new Multiplication();
		BiFunction<Integer, Integer, Integer> product = multiplication::multiply;
		int pr = product.apply(11, 5);
		System.out.println("Product of given number is: " + pr);
	}
}
