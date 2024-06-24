package com.corejava.downupcasting;
class A{
	public void show1() {
		System.out.println("In A show");
	}
}
class B extends A{
	public void show2() {
		System.out.println("In B show");
	}
}
public class DownUpCasting {
	public static void main(String[] args) {
		A obj1 = new B(); 
		//same as A obj1 = (A) new B(); is called Up casting 
		obj1.show1();
		// gets only show1 method bcoz object of B assigns to A(parent reference)
		B obj2 = (B)obj1;
		// obj1 is of type A so to assign to type B we do Down casting
		// we will get both methods show1 and show2
		obj2.show1();
		obj2.show2();
	}

}
