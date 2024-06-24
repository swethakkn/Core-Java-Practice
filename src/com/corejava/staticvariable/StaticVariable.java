package com.corejava.staticvariable;

class Mobile{
	
	String brand;
	int price;
	//String type;
	static String type;
	public void show() {
		System.out.println(brand + " : " + price + " : " + type );
	}
		
}

public class StaticVariable {
	public static void main(String[] args) {
		Mobile.type = "SmartPhone";
		Mobile mobile1 = new Mobile();
		mobile1.brand = "Apple";
		mobile1.price = 1200;
		//mobile1.type = "SmartPhone";

		
		
		Mobile mobile2 = new Mobile();
		mobile2.brand = "Samsung";
		mobile2.price = 1000;
		//mobile2.type = "SmartPhone";
		//both objects type is common so we an make it as static variable in Mobile class 
		
		mobile1.show();
		mobile2.show();
		//mobile1.type = "Phone";
		Mobile.type = "Phone";
		//as type is static variable it changes for all objects
		
		mobile1.show();
		mobile2.show();
		
		
		
	}

}
