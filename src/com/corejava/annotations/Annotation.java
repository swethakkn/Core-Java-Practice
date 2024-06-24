package com.corejava.annotations;

/*Annotations in Java provide additional information to the compiler and JVM.
 *  An annotation is a tag representing metadata about classes, interfaces, variables, methods, or fields
 * Annotations are mostly helpful/used in frameworks
 */
// @Deprecated is annotation that gives info about that class / method is deprecated
class A{
	public void show() {
		System.out.println("In A show");
	}
}
class B extends A{

	@Override // Override annotation

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("In B show");
	}
	
	
}
public class Annotation {
	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		
	}

}
