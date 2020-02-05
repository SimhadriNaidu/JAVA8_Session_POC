package com.java8.pre.funtionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
	
	Consumer<Integer> c =  t-> System.out.println(t);
	List<Integer> al = Arrays.asList(1,2,3);
	 al.stream().forEach(c);
	}
}
