package com.java8.methodreferences;


class Message {
	Message(String mesg) {
		System.out.println(" " + mesg);
	}
}
@FunctionalInterface
interface Messanger {
	Message getMessage(String msg);
}



public class ConstructorReference {

	public static void main(String[] args) {
		Messanger msgr = Message::new;
//		Message message = new Message("from noraml constructor");
		msgr.getMessage("get Msg from Constructor ");
	}
}
