package com.corejava.inheritance;
// child class-parent class, superclass-subclass, base class- derived class
class Calc{
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public int sub(int n1, int n2) {
		return n1-n2;
	}
}
class AdvCalc extends Calc{
	public int mul(int n1, int n2) {
		return n1*n2;
	}
	public int div(int n1, int n2) {
		return n1/n2;
	}
}
// if parent class doesnt have any parent class is called single level inheritance
class MoreAdvCalc extends AdvCalc{
	public double power(double n1, double n2) {
		return Math.pow(n1, n2);
	}
	
}
// if parent class have another parent class is called Multi-level inheritance
/*
 * Java doesn't support multiple inheritance i.e child doesn't have multiple
 * parents bcoz child may get confused when it calls a method where both parents
 * have the same method. this problem is called Ambiguity. but we can do with 
 * Interfaces we will get to know when we learn Interfaces.
 * 
 */
public class Inheritance {
	public static void main(String[] args) {
		MoreAdvCalc calculator = new MoreAdvCalc();
		System.out.println(calculator.add(4,5));
		System.out.println(calculator.sub(9,5));
		System.out.println(calculator.mul(4,5));
		System.out.println(calculator.div(9,5));
		System.out.println(calculator.power(4,2));
		
		
	}

}
