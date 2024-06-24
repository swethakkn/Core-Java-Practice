package com.corejava.thisandsupermethods;
// every class extends Object class even you didn't mentioned
class A{
	public A() {
		// executes the constructor of a super class default even u didn't mentioned
		super();
		System.out.println("In A");
	}
	public A(int n) {
		super();
		System.out.println("In A int");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("In B");
	}
	public B(int n) {
		//super(); // executes the constructor of the super class
		this(); //executes the constructor of the same class
		System.out.println("In B int");
	}
	
}
public class ThisandSuperMethods {
	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(5);
		
	}

}
