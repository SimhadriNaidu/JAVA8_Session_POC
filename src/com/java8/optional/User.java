package com.java8.optional;

import java.util.ArrayList;
import java.util.List;

import com.java8.operstre.Animal;

public class User {

	private String name;
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}

	private String email;

	
	public User() {
		super();
	}

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public static User getUserData() {
		
		return new User();
	}
	
	public static List<User> getData() {
		List<User> userList = new ArrayList<>();
		
		userList.add(new User("Jaguar", "s@s.com"));
		userList.add(new User("Puma","a@a.com"));
		userList.add(new User("Dog", "b@b.com"));
		return userList;
//		return new User();
	}
	
}
