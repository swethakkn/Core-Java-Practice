package com.corejava.helloworld;

import com.corejava.classandobject.Calculator;

public class Helloworld {
	int num;
	static int value = 7;
	public static void main(String[] args) {
		System.out.println("Hello World! Welcome to Core JAVA");
		Calculator calc = new Calculator();
		calc.add(0, 0);
		Helloworld world = new Helloworld();
		world.display(5);
		System.out.println(value);
	}
	public void display(int a) {
		int num2;
		value = a;
		System.out.println(value);
		value = 9;
		System.out.println(value);
	}

}
