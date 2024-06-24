package com.corejava.functionalinterface;

/*Functional interface is the interface with only one abstract method also called SAM - Single Abstract Method Interface
 *We can write many abstract methods in interface, to make it specific functional interface use annotation
 */

@FunctionalInterface
interface A{
	void show(int number);
}

public class functionalinterface {
	public static void main(String[] args) {
		// to instantiate interface use a class extends interface or anonymous class as below
		A obj = new A(){
			public void show(int number) {
				System.out.println("In show " + number);
			};
		};
		obj.show(5);
	}

}
