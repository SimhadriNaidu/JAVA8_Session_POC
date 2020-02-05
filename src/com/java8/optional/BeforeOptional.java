package com.java8.optional;

import java.util.Optional;

public class BeforeOptional {

	public static void main(String[] args) {
		String[] str = new String[10];
//	        //Getting the substring
//	        String str2 = str[9].substring(2, 5);
//	        //Displaying substring
//	        System.out.print(str2);  
		
// Using Optional
		Optional<String> opt = Optional.ofNullable(str[9]);
		if (opt.isPresent()) {
			String str1 = str[9].substring(2, 5);
			System.out.print(str1);
		} else {
			System.out.println("Cannot get the substring from an empty string");
		}
	}
}
