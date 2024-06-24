package com.corejava.methodoverloading;

public class Calculator {
	// same method name with different number of parameters/type of parameters
	// method overloading happens within the same class
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	public double add(double n1, int n2) {
		return n1+n2;
	}

}
