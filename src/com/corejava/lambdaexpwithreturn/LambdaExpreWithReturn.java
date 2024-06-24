package com.corejava.lambdaexpwithreturn;
/*A lambda expression is a short block of code which takes in parameters and returns a value.
 *Lambda expressions are similar to methods, but they do not need a name and they can be implemented right
 * in the body of a method.
 * The simplest lambda expression contains a single parameter and an expression as "parameter -> expression"
 *To use more than one parameter, wrap them in parentheses "(parameter1, parameter2) -> expression"
 *In order to do more complex operations, a code block can be used with curly braces.
 * If the lambda expression needs to return a value, then the code block should have a return statement.
 * code block has nothing just only return value no need to write braces and return just value is enough */

@FunctionalInterface
interface Calc{
	int add(int num1 , int num2);
}

public class LambdaExpreWithReturn {
	public static void main(String[] args) {
		// Lambda expression with return
		Calc obj = (num1,num2) -> num1+num2; // no need to mention return here like return num1+num2
		System.out.println(obj.add(5, 6));
	}
	

}
