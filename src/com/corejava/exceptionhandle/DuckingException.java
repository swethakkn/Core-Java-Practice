package com.corejava.exceptionhandle;

/*"duck an exception" means "not handle the exception". 
 * This actually explains the name: to duck means to "To evade; dodge". 
 * The method ducking the exception simply doesn't handle it (because, for example, it is not its purpose) 
 * and let the exception be thrown to the calling method.
 * This is done using the throws keyword. Never use throws keyword with main method
*/

class CallingDuckingException{
	public void show() throws ClassNotFoundException {
		// need to give calss Name with full package otherwise throws exception
		Class.forName("com.corejava.exceptionhandle.DuckingException");
	}
	/*
	 * public void show1() throws ClassNotFoundException { Class.forName("Calc"); }
	 */
}

public class DuckingException{
	static {
		System.out.println("Class Loaded...");
	}
	public static void main(String[] args) {
		CallingDuckingException obj = new CallingDuckingException();
		try {
			System.out.println("Calling Show Method");
			obj.show();
			System.out.println("done");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // Prints the exception overall stack
		}
		
	}

}
