package com.java8.methodreferences;

@FunctionalInterface
interface Calculator{  
    void add(int numx, int y);  
}
public class Calc {
	public static void add(int x, int y) {
		System.out.println("Static method refernces Addition " +(x+y));
	}
	
	public void letsAdd(int x, int y) {
		System.out.println("Instance method refernces Addtion  "+ (x+y));
	}

	public static void main(String[] args) {

//		Calc.add(10, 20);
		// refeering to a static method
		Calculator sa = Calc::add;
		sa.add(10,20);
		
		//referring to a instance method
		Calc cc = new Calc();
		Calculator calci = cc::letsAdd;
		calci.add(10, 20);
		
		
	}

}
