package com.corejava.constructors;

class Person {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//Java will give you a default constructor if you didn't wrote any constructor
	//you can have many constructors by following overloading concept
	
	//default constructor
	public Person() { 
		this.age = 12;
		this.name = "swetha";

	}
	
	//Parameterized constructor with 2 parameters
	public Person(int age, String name) { 
		this.age = age;
		this.name = name;
	}
	//Parameterized constructor with 1 parameter
	public Person(String name) {
		this.age = 12;
		this.name = name;
		
	}

}

public class Constructors {
	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println(person1.getName() + ": " + person1.getAge());
		Person person2 = new Person("Venkat");
		System.out.println(person2.getName() + ": " + person2.getAge());
		Person person3 = new Person(40, "Venkat");
		System.out.println(person3.getName() + ":" + person3.getAge());
		
	}

}
