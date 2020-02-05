package com.java8.pre.funtionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

	static String show(String company,String location) {
		return "Hello " + company +" "+location;
	}
	static String show(String company) {
		return "Hello " + company ;
	}

	public static void main(String[] args) {
		// Function interface referring to a method
		Function<String, String> function = company->company.toUpperCase();
		System.out.println(function.apply("nisum"));
		
		
//		Function<String, String> function2 = FunctionDemo::show;
//		System.out.println(function2.apply("Nisum"));
//		
//		BiFunction<String, String, String> fun = FunctionDemo::show;
//		// Calling Function interface method
//		System.out.println(fun.apply("Nisum","Hyd"));

	}

}
