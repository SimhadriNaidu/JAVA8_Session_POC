package com.java8.pre.funtionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author sguntreddi
 *
 */
public class PredicateDemo  {

	public static void main(String[] args) {
	
		Predicate<Integer> predicate1 = t -> t % 2 == 0 ;
		Predicate<Integer> predicate12 = (x) -> x % 3 ==0 ;

		// Using and()
		System.out.println(predicate1.and(predicate12).test(6));

	
	List<Integer> al = Arrays.asList(1,2,3);
	 al.stream().filter(t -> t % 2 == 0).forEach(t-> System.out.println(t));
	}

}
