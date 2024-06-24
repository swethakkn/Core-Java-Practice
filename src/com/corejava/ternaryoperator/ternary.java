package com.corejava.ternaryoperator;

public class ternary {
	public static void main(String[] args) {
		//set result to 10 if num is even else set result to 20
		int num =90;
		int result = 0;
		/*
		if(num%2==0)
			result = 10;
		else
			result = 20;
			*/
		// Same thing using ternary operator ?:
		result = num%2==0?10:20;
		System.out.println(result);
	}

}
