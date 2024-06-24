package com.corejava.conditionalstatements.IfElseif;

public class Ifelseif {
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 38;
		int num3 = 444;
		if(num1>num2 && num1>num3)
			System.out.println(num1);
		else if(num2>num3)// no need of num2>num1 because you already checked above
			System.out.println(num2);
		else
			System.out.println(num3);
		
	}

}
