package com.corejava.staticblock;

class Mobile{
	String brand;
	int price;
	static String type;
	static {
		Mobile.type = "Phone";
		System.out.println("In static block");
	}
	
	//Instance block which executes when object is created
	
	{
		System.out.println(" In instance block");
	}
	
	public Mobile() {
		System.out.println("In constructor");
		
	}
	
}

public class StaticBlock {
	public static void main(String[] args) throws ClassNotFoundException{
		// when we create a object class loads and object creates
		// class loads only once which executes static block only once
		// when you create multiple objects the constructor executes multiple times
		/*Mobile mobile1 = new Mobile();
		mobile1.brand = "Apple";
		Mobile mobile2 = new Mobile();*/
		//Java class "Class" has method forName used to load the class without creating an object
		Class.forName("com.corejava.staticblock.Mobile"); 
		
		
		
		
		
	}

}
