package com.corejava.encapsulation;

class Person{
	//private variables are defined and are accessed in the class.
	private int age;
	private String name;
	// to access these private variables indirectly by calling these public methods
	//Encapsulation is binding our data /variables with the method  
	//no outside world will access them the only way is by the methods
	public void setAge(int personage) {
		age = personage;	
	}
	public int getAge() {
		return age;	
	}
	public void setName(String personname){
		name = personname;
	}
	public String getName(){
		return name;
	}
	
}
public class Encapsulation {
	public static void main(String[] args) {
		Person person1 = new Person();
		//as person1.age is not visible as it is private instance variable
		// we use public methods to access private variables
		person1.setAge(25);
		person1.setName("Tom");
		System.out.println(person1.getName() + ":" + person1.getAge());
	}

}
