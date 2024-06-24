package com.corejava.stackandheap;

public class Calculator {
	int num = 5; // instance variable stores in heap memory
	// add method variables n1, n2 stores in stack memory
	public int add(int n1,int n2) {
		return n1+n2;
	}

}
