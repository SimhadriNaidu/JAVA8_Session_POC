package com.java8.methodreferences;

interface SomeInterface{
	MethodRefenrces getMethodRefenrces(String msg);
}
public class MethodRefenrces {

	 MethodRefenrces(String msg) {
System.out.println("Helo this a Constructor "+msg);
	}
	public  void saySomthing() {
		System.out.println("Static");
	}
	
	public static void main(String[] args) {
		
//		MethodRefenrces methodRefenrces = new MethodRefenrces();
		SomeInterface s = MethodRefenrces::new;
		s.getMethodRefenrces("message");
	}
}
