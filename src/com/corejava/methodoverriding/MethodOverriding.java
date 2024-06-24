package com.corejava.methodoverriding;
class Calc{
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public int sub(int n1, int n2) {
		return n1-n2;
	}
	public Object test(Object obj) {
		System.out.println("Parent string method");
		return "" ;
	
	}
}
class AdvCalc extends Calc{
	/*
	 * same add method exists in parent class but this method overrides the
	 * parents method when childs object is created.
	 */
	
	public int add(int n1, int n2) {
		return n1+n2+1;
	}
	/*
	 * public String test(String name) { System.out.println("CHild string method");
	 * return "Child" ;
	 * 
	 * }
	 */
}
public class MethodOverriding {
	public static void main(String[] args) {
		AdvCalc calculator = new AdvCalc();
		System.out.println(calculator.add(4,5));
		System.out.println(calculator.sub(5,2));
		calculator.test("calculator");
		
	}

}
