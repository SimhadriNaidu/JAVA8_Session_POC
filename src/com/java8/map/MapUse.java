package com.java8.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> naturals = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
		naturals.stream()
		    .map(n -> n * 2)
//		    .peek(System.out::println)
		    .collect(Collectors.toList());
		System.out.println(naturals);
	}
	

}
