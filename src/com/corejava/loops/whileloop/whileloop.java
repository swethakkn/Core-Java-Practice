package com.corejava.loops.whileloop;

public class whileloop {
	public static void main(String[] args) {
		int i = 1;
		while(i<=5) {
			System.out.println("Hi" + i);
			i++;
			int j = 1;
			// Nested while loop
			while(j<=3) {
				System.out.println("Hello" + j);
				j++;
			}
		}
		System.out.println("bye"+ i);
	}

}
