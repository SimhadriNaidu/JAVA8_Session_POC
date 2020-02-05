package com.java8.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println("Comparator without lambda");
				return o1.compareTo(o2);
			}
		};
		System.out.println(comparator.compare(5,4));

		Comparator<Integer> comparatorLambda = (s1,s2)->s1.compareTo(s2);
		
//		Comparator<Integer> comparatorLambda = (s1,s2)->{
//			System.out.println("Comparator with lambda");
//			return s1.compareTo(s2);
//			
//		};
		System.out.println(comparatorLambda.compare(5,4));
	}

}
