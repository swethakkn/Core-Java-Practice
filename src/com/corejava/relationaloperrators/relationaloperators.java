package com.corejava.relationaloperrators;

public class relationaloperators {
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 9;
		// >, <, >=, <=, ==, !=, !
		boolean result = num1 > num2; //result of relational operators is boolean
		//boolean result = !( num1 == num2);
		System.out.println(result);
		// we can do these relatinal operators with float numbers as well
		double one = 2.8;
		double two = 7.3;
		boolean value = one <= two;
		System.out.println(value);
	}

}
