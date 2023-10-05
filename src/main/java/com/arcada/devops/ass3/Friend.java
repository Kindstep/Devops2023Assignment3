package com.arcada.devops.ass3;



public class Friend {
	
	private String firstName;
	private String lastName;
	private int age;

	 public Friend(String firstName, String lastName, int age) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	 }

	 public String getName() {
		 	return firstName + " " + lastName;
	 }
	 
	 public int getAge() {
		 return age;
	 }
	 
}