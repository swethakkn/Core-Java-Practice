package com.corejava.bufferreaderandscanner;

import java.io.IOException;

public class NormalRead {
	public static void main(String[] args){
		System.out.println("Enter a Number : ");
		try {
			int num = System.in.read(); 
			// read method always gives the ASCII number not the entered number if you enter A also it gives a integer type
			// may throw io exception(checked) so compiler forces to handle that
			// read method doesnt work for bigger numbers so we use BufferReader
			System.out.println(num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
}
	

}
