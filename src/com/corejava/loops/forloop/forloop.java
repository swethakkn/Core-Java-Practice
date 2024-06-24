package com.corejava.loops.forloop;

public class forloop {
	public static void main(String[] args) {
		/*
		//for(int i=1;i<=4;i++) { //increment order
		for(int i=5;i>=1;i--) { // decrement order
			System.out.println("Hi"+ i);
		}
		*/
		for(int i=1;i<=5;i++) {
			System.out.println("DAY"+i);
			for(int j=9;j<=17;j++) {
				System.out.println(j+":00hrs" +"-"+(j+1)+":00hrs");
			}
		}
		
	}
}
