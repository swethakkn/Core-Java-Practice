package com.corejava.lambdaexpression;

/*Lambda expressions "->" were added in Java 8 .
 * Lambda expressions improve code readability and do not require interpretation, allow you to write concise code
 * Lambda expression works only with Functional Interface*/
@FunctionalInterface
interface A{
	// abstract method with 2 arguments
	void show(int number1,int number2);
}
@FunctionalInterface
interface B{
	void config(String word);
}
public class LambdaExpression {
	public static void main(String[] args) {
		// Instead of code in functional interface concept we use lambda exression to simplify
		A obj = (number1 , number2)-> System.out.println("In show " + number1 + "," + number2);
		obj.show(5,6);
		
		B obj1 = word -> System.out.println(word);
		obj1.config("swetha");
		
	};

}
