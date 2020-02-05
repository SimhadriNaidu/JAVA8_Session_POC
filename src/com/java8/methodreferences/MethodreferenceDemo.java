package com.java8.methodreferences;

@FunctionalInterface
interface Mobile{
	void call(int a);
}
public class MethodreferenceDemo {

	public static void callStatic(int a) {
		System.out.println("Static method");
	}
	
//	public void callInstance(){  
//		System.out.println("Instance Method");  
//	    }
	
	public static void main(String[] args) {
		
//		MethodreferenceDemo demo = new MethodreferenceDemo();

		//refering a instance method --Method reference using the object of the class
		Mobile mobile2 = MethodreferenceDemo::callStatic;
		// calling interface method
		mobile2.call(1);
	}

}
