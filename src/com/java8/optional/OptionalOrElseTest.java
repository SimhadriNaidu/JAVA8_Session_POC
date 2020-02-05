package com.java8.optional;

import java.util.Optional;

public class OptionalOrElseTest {

	//orElse
	public static String optionalOrElse() {
		Optional<User> userOptional = Optional.ofNullable(UserData.userSupplier.get());
		
		String name = userOptional.map(User::getName).orElse("DefalutName");
		return name;
	}
	
	//orElseGet
	public static String optionalOrElseGet() {
		Optional<User> userOptional = Optional.ofNullable(null);
		
		String name = userOptional.map(User::getName).orElseGet(()->"DefalutName");
		return name;
	}
	
	//orElseThrow
	public static String optionalOrElseThrow() {
		Optional<User> userOptional = Optional.ofNullable(null);
		
		String name = userOptional.map(User::getName).orElseThrow(()->new RuntimeException());
		return name;
	}
	public static void main(String[] args) {
		
		System.out.println("OrElse Utility :: "+optionalOrElse());
		System.out.println("OrElseGet Utility :: "+optionalOrElseGet());
		System.out.println("OrElseThrow Utility :: "+optionalOrElseThrow());
	}

}
