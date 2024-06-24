package com.corejava.abstractkeyword;
abstract class Car{
	public Car() {
		System.out.println("In abstract class constructor");
	}
	public Car(int value) {
		System.out.println("In argument constructor");
	}
	
	public abstract void drive(); // abstract methods must be in abstract class
	// if you are not implementing the method use abstract keyword.
	public void playMusic() {
		System.out.println("Playing Music");
	}
	// its not mandatory to have abstract methods in abstract class.
	// abstract class may have only normal methods/ only abstract methods or mix
}
abstract class Vehicle extends Car{
	
	public void seating(){
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

}
class Honda extends Vehicle{ // this class is called concrete class. 
	// when class extends abstract class it should implement the abstract method
	public Honda(int value) {
		
		System.out.println("In honda argument constructor");
	}
	public void drive() {
		System.out.println("Driving");
	}

	public Honda() {
		super();
		// TODO Auto-generated constructor stub
	}
}
public class AbstractKeyword {
	public static void main(String[] args) {
		Honda obj = new Honda(34); // create an object of concrete class
		obj.drive();
		obj.playMusic();
	}

}
