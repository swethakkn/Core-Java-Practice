package com.corejava.abstractandanonymousinnerclass;
abstract class A{ // abstract class with abstract methods
	public abstract void show();
	public abstract void config();
}

public class AbstractAnonymousInnerClass {
	public static void main(String[] args) {
		A obj = new A() { // anonymous Inner class

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("In Show");
				
			}

			@Override
			public void config() {
				// TODO Auto-generated method stub
				System.out.println("In config");
				
			}
			
		};
		obj.show();
		obj.config();
		
	}

}
