package com.corejava.exceptionhandle;
// Custom Exception

class SwethaException extends Exception{ // we can extends Runtime exception also
	public SwethaException(String string) {
		// when you want to pass a message you have to accept the message as string
		super(string); 
	}
	
}

public class CustomException {
	public static void main(String[] args) {
		int i = 6;
		int j=1;  
		System.out.println("HELLO"); 
		try {
			j = 18/i; 
			if (j==0)
				throw new SwethaException("Custom Exception");
			
		}
		catch(SwethaException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			j=18;
			System.out.println(e);
		}
		catch (Exception e) { 
			System.out.println("Something went wrong...");
			System.out.println(e.toString()); 
		}
		  
		System.out.println(j);
	}

}
