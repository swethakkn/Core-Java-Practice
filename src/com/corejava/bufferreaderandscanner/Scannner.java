package com.corejava.bufferreaderandscanner;

import java.util.Scanner;

//Instead of using InputStreamReader and BefferedReader use scanner
public class Scannner {
	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in); // import scanner package
		System.out.println(sc.nextInt());
		sc.close();
		
				
	}

}
