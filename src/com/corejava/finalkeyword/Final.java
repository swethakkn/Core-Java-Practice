package com.corejava.finalkeyword;

/*final keyword can be used with variables, methods and class
 * To make variable constant we use final keyword with variable
 * final keyword with method avoids method overriding
 * final keyword with class avoids class inheritance
 * */
// to stop the inheritance of your class use final keyword with class
// final class Calc{
class Calc{
	//final keyword with method can avoid method overriding
	public final void show() {
		System.out.println("Calc by Shwetha");
	}
	public void add(int n1,int n2) {
		System.out.println(n1+n2);
	}
}
// we cannot extends Calc when Calc class is with final keyword
class AdvCalc extends Calc{
	/*//Overriding the show method which we get error when we make final method
	public void show() {
		System.out.println("Calc by Venkat");
	}*/
	
}
public class Final {
	public static void main(String[] args) {
		/*
		 * // to make variable as constant we use final keyword 
		 * final int marks = 99;
		 * //we will get error when we try assign new value to marks as,marks = 100;
		 * System.out.println(marks);
		 */
		AdvCalc obj = new AdvCalc();
		obj.show();
		obj.add(5,4);
		
		
		
		
		
	}

}
