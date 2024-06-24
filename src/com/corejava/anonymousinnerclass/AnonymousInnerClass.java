package com.corejava.anonymousinnerclass;
class A{
	public void show() {
		System.out.println("In A Show");
	}
}

/* If we want to override the show method of A class generally we use inheritance.
 * if we want overrided method to use only once we got for Anonymous inner class
 * instead of writing a class again which extends A class
*/
public class AnonymousInnerClass {
	public static void main(String[] args) {
		A obj = new A(){ // to override show method we write here itself
			public void show() {
				System.out.println("In Anonymous Inner class show");
			}
			
		}; // this is the anonymous inner class which doesn't have any name
		obj.show();
		
	}

}
