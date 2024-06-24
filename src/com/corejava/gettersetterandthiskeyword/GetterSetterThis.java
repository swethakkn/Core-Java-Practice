package com.corejava.gettersetterandthiskeyword;

class Person{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	/*
	public void setAge(int age,Person obj ) {
		obj.age = age;
	}*/
	// instead of passing the object java gives the object by this keyword
	
	public void setAge(int age) {
		this.age = age;
	} 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class GetterSetterThis {
	public static void main(String[] args) {
		Person person1 = new Person();
		//person1.setAge(30,person1);
		person1.setAge(30 );
		person1.setName("swetha");
		System.out.println(person1.getName() + ":" + person1.getAge());
	}

}
