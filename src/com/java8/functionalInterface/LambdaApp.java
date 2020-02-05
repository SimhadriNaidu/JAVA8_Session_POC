package com.java8.functionalInterface;

@FunctionalInterface
interface Cab{
	double bookCab(String source, String destination);
}

//class Uber implements Cab{
//
//	@Override
//	public void bookCab() {
//		System.out.println("UberCab booked");
//		
//	}
//	
//}
public class LambdaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cab cab = new Uber();// This is ploymorphic statement
//		 cab.bookCab();
		 
//		 Cab cabb = ()-> {
//			 System.out.println("UberX booked in Lambda");
//		 };
//		 cabb.bookCab();
		 
		 
		 Cab cab = (source,destination)-> {
			 System.out.println("UberX booked from "+source +" to "+destination +"in Lambda");
			 
			 return 550.99;
		 };
		 double rate = cab.bookCab("Hitech","Uppal");
		 System.out.println("Fare would be "+rate);
		 
	
	}

}
