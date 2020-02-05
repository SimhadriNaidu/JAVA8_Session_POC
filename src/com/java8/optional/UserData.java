package com.java8.optional;

import java.util.function.Supplier;

public class UserData {

	public static Supplier<User> userSupplier = ()->{
		return new User(null,"simha@nisum.com");
	};
}
