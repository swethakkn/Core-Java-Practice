package com.corejava.assignmentoperators;

public class AssignmentOperators {
 public static void main(String[] args) {
	 int num1 = 7;
	 int num2 = 5;
	 // Arithmetic operators +, -, *, / for quotient, % for reminder
	 int result = num1 + num2;
	 System.out.println(result);
	 
	 int number = 8;
	 //number = number + 6;
	 //number = number +1;
	 //number+=1;
	 //number++; //post-increment
	 //++number; // pre-increment
	 //number--; // post-decrement
	 // --number; //pre-decrement
	 // both post and pre-increment results same
	 // int value = number++; // fetch the value and then increments so value = 8
	 int value = ++number; // increments first and fetches next so value = 9
	 System.out.println(value); 
	 
}
}
