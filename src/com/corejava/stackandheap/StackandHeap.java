package com.corejava.stackandheap;

public class StackandHeap {
	// each method( add and main methods) has its own stack memory Last In First Out
	
	public static void main(String[] args) {
		//obj and odj1 are instance variables stores in heap memory
		Calculator obj = new Calculator();
		Calculator obj1 = new Calculator();
		obj.num = 12; // changing only obj.num value doesn't impact obj1.num value
		System.out.println(obj.num);
		System.out.println(obj1.num);
		
		
	}

}
