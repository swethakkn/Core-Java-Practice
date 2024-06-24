package com.corejava.methodoverloading;


public class Methodoverloading {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result1 = calc.add(3,4);
		int result2 = calc.add(4, 5, 6);
		double result3 = calc.add(3.8, 2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}

}
