package com.corejava.logicaloperators;

public class logicalOperators {
	public static void main(String[] args) {
		int x = 7;
		int y = 5;
		int a = 5;
		int b = 9;
		boolean result = x>y && a<b; // x>y || a<b , x>y || a<b || a>1
		System.out.println(result);
		//System.out.println(!result); // prints opposite to result
		
	}

}
