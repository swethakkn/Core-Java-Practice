package com.corejava.stringtype;

import java.util.StringTokenizer;

public class Stringtype {
	public static void main(String[] args) {
		String name ="Swetha";
		//String name = new String("Swetha");//Creates a String object of class String
		System.out.println(name);
		System.out.println(name.concat("Kakani"));//check the methods of String type of object name
		System.out.println(name + " Kakani");
		System.out.println(name.contains("r"));
		System.out.println(name.toUpperCase());
		
		String names = "Venkat, Swetha, Rithwik, Vihaan";
		String values[] = names.split(",");
		for(String value : values) 
			System.out.println(value.trim());
		
		// StringTokenizer practice
		
		StringTokenizer tokens = new StringTokenizer("I Love watching TV"," ");
		System.out.println(tokens.countTokens());	
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
			
		}
		
		
	}

}
