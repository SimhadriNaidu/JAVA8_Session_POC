package com.java8.optional;

import java.util.Optional;

public class OptionalExample {

	

	// With Optional
	public static Optional<User> getUserNameOptional() {
		Optional<User> optionalUser = Optional.ofNullable(UserData.userSupplier.get());
		if (optionalUser.isPresent()) {
			System.out.println("Yes, User is there");
			return optionalUser;
		}
		return Optional.empty();

	}

	public static void main(String[] args) {

		Optional<User> name = getUserNameOptional();
		System.out.println(name.get());
		if (name.isPresent()) {
			System.out.println("Name is " + name.get().getName().length());
//			System.out.println("Name lenght is " + name.get().length());
		}

//		name.ifPresent(s -> System.out.println("In If present :: " + s.length()));


	}

}
