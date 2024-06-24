package com.corejava.exceptionhandle;

public class ExceptionHandling {
	public static void main(String[] args) {
		
		/*
		 * // try catch block for exception handling int i = 0; int j = 0; // these 2
		 * are normal statements System.out.println("HELLO"); // if try block is good
		 * when executing it skips catch block and executes next statements try {
		 * 
		 * j = 18/i; // divided by 0 throws exception } catch (Exception e) { // TODO:
		 * handle exception System.out.println("Something went wrong...");
		 * System.out.println(e.toString()); }
		 * 
		 * System.out.println(j); System.out.println("BYE");
		 */
		
		
		// Exception handling try with multiple catch blocks
		/*
		 * int i = 2; int j = 0; int nums[] = new int[5]; String name = null;
		 * 
		 * try { j = 18/i; System.out.println(j); System.out.println(nums[2]);
		 * System.out.println(nums[4]); System.out.println(name.length()); // throws
		 * null pointer exception bcoz name is null } catch(ArithmeticException e) {
		 * System.out.println("Can't divide by Zero..."); }
		 * catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println("Array index is out of bound..."); }
		 * 
		 * finally use exception type to handle any other types of exceptions bcoz its a
		 * parent class of all exception classes.
		 * 
		 * catch(Exception e) { System.out.println(e); }
		 */
		
		// throw Keyword
		
		int i = 0;
		int j = 0; // these 2are normal statements 
		System.out.println("HELLO"); // if try block is good when executing it skips catch block and executes next statements 
		try {
			j = 18/i; // divided by 0 throws exception 
			// if divided by larger than numerator the result of j is zero and you dont want to print zero
			// so you want to throw exception if j value is zero
			if (j==0)
				throw new ArithmeticException("executed default value");
			
		}
		catch(ArithmeticException e) {
			j=18;
			System.out.println(e);
		}
		catch (Exception e) {
			// TODO:handle exception 
			System.out.println("Something went wrong...");
			System.out.println(e.toString()); 
		}
		  
		System.out.println(j);
		 

	}

}
