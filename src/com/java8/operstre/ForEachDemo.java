package com.java8.operstre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Naidu");
		list.add("Ram");
		list.add("Raju");
		list.add("Mohan");
		
		list.stream().forEach(e->System.out.println(e));
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		
		map.forEach((key,value)->System.out.println("Key "+key + " Value "+value));
		
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		
		
		for(String s: list) {
			if(s.startsWith("R")) {
				System.out.println(s);
			}
		}
		
		list.stream().filter(s->s.startsWith("R")).forEach(e->System.out.println(e));
		        List<Integer> list1 = new ArrayList<>();
		        for (int i = 0; i < 10; i++) {
		            list1.add(i);
		        }
		        list1.stream().forEach(System.out::println);
		        System.out.println("Parallel Stream..............");
		        list1.parallelStream().forEach(System.out::println);
		    

	}

}
