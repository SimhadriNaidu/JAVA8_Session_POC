package com.java8.lambda;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		
		// with out lambda
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable interface without lambda");
				
			}
		};
		new Thread(runnable).start();
		
		//with lambda
		Runnable r = ()-> {
			System.out.println("Runnable interface with lambda");
		};
		new Thread(r).start();

	}

}
