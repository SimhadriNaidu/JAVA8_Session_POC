package com.java8.pre.funtionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {

	public static void main(String[] args) {
//		
		Supplier<String> supplier = () ->{
			return "Hi, This is Supplier Demo in lambda";
		};
		System.out.println(supplier.get());
		
		List<String> list = Arrays.asList("1","2","3");
		System.out.println(list.stream().findAny().orElseGet(supplier));
	}

	
	

}
