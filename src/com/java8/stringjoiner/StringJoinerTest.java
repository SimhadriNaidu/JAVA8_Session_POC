package com.java8.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
//		StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter
		StringJoiner joinNames = new StringJoiner(",", "[", "]"); 
		
		StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter 
		joinNames2.add("Naidu");
		joinNames2.add("Ravi");

		// Adding values to StringJoiner
		joinNames.add("Ram");
		joinNames.add("Raju");
		joinNames.add("Naidu");
		joinNames.add("Ravi");

		System.out.println(joinNames);
		
		StringJoiner merge = joinNames.merge(joinNames2);   
        System.out.println(merge);  

	}

}
