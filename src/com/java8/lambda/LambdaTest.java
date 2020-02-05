package com.java8.lambda;

@FunctionalInterface
interface LambdaInterface {
	public void say();
}

public class LambdaTest {

	public static void main(String[] args) {

		// without lambda, LambdaInterface implementation using anonymous class
		LambdaInterface lambdaInterface = new LambdaInterface() {
			public void say() {
				System.out.println("Say Something in Without Lambda " );
			}
		};
		lambdaInterface.say();

		// with lambda
		LambdaInterface lambdaInterface2 = () -> {
			System.out.println("Say Somthing in Lambda");
		};
		lambdaInterface2.say();

	}
}
