package com.corejava.anonymousobject;

class A{
	public A() {
		System.out.println("Object Created");
	}
	 public void show() {
		 System.out.println("In A - show");
	 }
}
/*
 * Anonymous object is an object that is created but not assigned to
  the object variable
   new A();
   so can't use this object again without assinging to an variable
   we can use the methods of that class as new A().show();
   if we want to use again another object will be created.
   generally we use A obj = new A(); is called Referenced Object
   
 */
public class AnonymousObject {
	public static void main(String[] args) {
		//A obj = new A();
		//obj.show();
		
		new A().show();
		new A().show(); 
	}

}
