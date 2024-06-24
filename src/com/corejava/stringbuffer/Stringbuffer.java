package com.corejava.stringbuffer;

public class Stringbuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); //empty object creating
		//gives 16 characters of buffer
		System.out.println(sb.capacity()); 
		
		
		StringBuffer sb1 = new StringBuffer("Swetha");
		System.out.println(sb1.capacity());//gives 16+6 = 22
		//StringBuffer methods like append, min capacity,insert, indexOf etc
		System.out.println(sb1.append(" Kakani"));
		// StringBuffer and StringBuilder has similar methods 
		//StringBuffer is thread safe where as StringBuilder is not
		// indexOf, substring, equals
		System.out.println(sb1.indexOf("a"));// gives the index of starting char of string
		System.out.println(sb1.indexOf("a", 6));
		System.out.println(sb1.substring(5));
		System.out.println(sb1.substring(4, 8));
		System.out.println(sb1.equals(sb));
		
	
	}

}
