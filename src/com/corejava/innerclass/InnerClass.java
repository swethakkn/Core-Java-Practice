package com.corejava.innerclass;

class A{ 
	// we cant make outer class as static only public,abstract and final are permitted
	// defining a variable in class
	int value = 54;
	//// defining a method in class
	public void show() {
		System.out.println("In A show");
	}
	// defining a class in class is Inner class
	static class B{ // we can make inner class as static
		// defining a method in inner class
		public void show1() {
			System.out.println("In Innerclass(B) of A show1");
		}
	}
}
public class InnerClass {
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.value);
		obj.show();
		//can't access inner class method with outer class object to do so
		//A.B obj1 = obj.new B();
		//if B class is static class you dont need obj.new B();
		A.B obj1 = new A.B();
		obj1.show1();
		
	}

}
