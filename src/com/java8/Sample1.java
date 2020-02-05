package com.java8;

@FunctionalInterface
interface LambdaExpressions {
	int add(int a, int b);
//	void draw();
}

public class Sample1 implements LambdaExpressions {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public static void main(String[] args) {

		LambdaExpressions lm1 = new Sample1();
		System.out.println("before Java8 "+lm1.add(1, 2));

		LambdaExpressions lm = new LambdaExpressions() {

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return (a + b);
			}

		};
		System.out.println("before Java8 with anonymous class "+lm.add(10, 20));

		/*
		 * with parameters
		 */
		LambdaExpressions ls = (a, b) -> (a + b);
		System.out.println("With Parameters  "+ls.add(10, 20));
		
		/*
		 * with type parameters
		 */
		LambdaExpressions ls1 = (int a, int b) -> (a + b);
		System.out.println("With Parameter Type "+ls.add(10, 20));


		/*
		 * without parameters
		 */
//	 LambdaExpressions ls = ()->{
//		 System.out.println("Without any Parameters");
//	 };
//	 ls.draw();

		//

	}

}
