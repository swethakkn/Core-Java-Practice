package com.corejava.interfaces;

/* Interface is where we declare only abstract methods and final static variables
 * By default all methods of interface are public abstract so no need to mention
 * By default all variables are final and static. so we need to assign value
 * bcoz interface doesn't have own memory in the heap
 * to define interface methods we use implements keyword with class
 * Types of Interface are  Normal, Functional and Marker interface
 * Normal means Interface has 2 or more methods
 * Functional means it has only one method
 * Marker Interface means no methods. we write these marker interfaces while we use serialization concept in JAVA
*/

interface A{
	int age = 36; // final and static
	String area = "Hyderabad";
	void show();
	void config();
}
interface X{
	void play();
}

/* class-- class use extends
 * class --interface use implements
 * interface -- interface use extends  for inheritance*/
interface Y extends X{
	
}
//to define or to use the interface methods use implements keyword
// Also class implements multiple interfaces where as in abstract,class can't extends 
//2 abstract classes
class B implements A,Y{  

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show");
	}

	@Override
	public void config() {
		// TODO Auto-generated method stub
		System.out.println("config");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play");
	}
	
	
}
public class Interface {
	public static void main(String[] args) {
		A obj; // we can reference to the interface same as parent class
		obj = new B(); // assign the class B object to interface reference
		obj.show();
		obj.config();
		/*
		 * B obj1 = new B(); obj1.play(); // to get play method reference has to be B
		 * class
		 */
		System.out.println(A.age); // get variables of interface directly as shown
		System.out.println(A.area);
	}

}
