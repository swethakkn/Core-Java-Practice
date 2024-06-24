package com.corejava.polymorphismdynamicmethoddispatch;
class A{
	
	public void show(){
		System.out.println("In A show");
	}
}
class B extends A{
	public void show(){
		System.out.println("In B show");
	}
}
class C extends A{
	public void show(){
		System.out.println("In C show");
	}
}



public class PolymorphismDynamicMethodDispatch {
	/* poly means many , morphism means behavior.  
	 * types of polymorphism
	 * 1. Compile time / early binding polymorphism
	 * 2. Runtime / late binding polymorphism
	 * compile time eg: Overloading - where behavior is defined at compile time
	 * 
	 * runtime eg: Overriding - where behavior is defined at run time
	 * 
	 * */
	public static void main(String[] args) {
		// run time polymorphism with the help of dynamic method dispatch 
		//Object reference can be a parent class
		A obj = new A();
		obj.show();
		// assinging object of B class to parent class A old reference variable
		obj = new B();
		obj.show();
		//assinging object of C class to parent class A old reference variable
		obj = new C();
		obj.show();
		/*
		 * in all the above three ways show method is behaving differently with 
		 * different objects and we are not sure which method is called at
		 * compile time so is called runtime polymorphism. All this process is
		 * dynamic method dispatch. This is all possible only when you have
		 * inheritance 
		 */		
	}

	

}
