package com.corejava.literals;

public class literals {
	public static void main(String[] args) {
		// literals and type conversion and casting
		int c = 257;
        byte k = (byte)c; //explicit type conversion called casting
        System.out.println(k);

        float f = 56.7f;
        int r = (int)f;
        System.out.println(r);
        // type promotion
        byte x = 10;
        byte y = 30;
        int result  = x*y;
        System.out.println(result);

	}
}
