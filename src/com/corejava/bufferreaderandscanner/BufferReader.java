package com.corejava.bufferreaderandscanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
	public static void main(String[] args) {
		
		System.out.println("Enter a number :");
		//InputStreamReader is a Reader type which accepts InputStream object
		// System.in is a InputStream Object
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(in); // Buffered Reader accepts a Reader parameter
		int enteredValue = 0;
		try {
			enteredValue = Integer.parseInt(buffer.readLine());
			buffer.close(); 
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(enteredValue);

		
		
		
	}

}
