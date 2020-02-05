package com.java8.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
//		Optional<Integer> optional = Optional.empty(); 
		Optional<Integer> optional = Optional.of(10);
		
//		Optional<Integer> optional = Optional.ofNullable(5); 
		optional.ifPresent(System.out::println);
		
//		 Integer i =optional.orElse(2);
//		 System.out.println(i+ " cccc");
//		if(optional.isPresent()){
//		    System.out.println("without IfPresent "+optional.get());
//		}

	}

}
