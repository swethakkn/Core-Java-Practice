package com.corejava.staticmethod;

class Mobile{
	String brand;
	int price;
	static String type;
	static {
		type = "Phone";
	}
	public void Show() {
		System.out.println(brand + " : " + price + " : " + type );
	}
	public static void Show1(Mobile mobile) {
		//System.out.println(brand + " : " + price + " : " + type );
		//we cant get instance variables brand,price in static method
		//so we can pass Mobile object argument in show1 method
		System.out.println(mobile.brand + " : " + mobile.price + " : " + type );
	}

	
}

public class StaticMethod {
	public static void main(String[] args) {
		Mobile mobile1 = new Mobile();
		mobile1.brand = "Apple";
		mobile1.price = 1200;
		mobile1.Show();
		
		Mobile mobile2 = new Mobile();
		mobile2.brand = "Samsung";
		mobile2.price = 1000;
		//show the details of mobile2 using static method by passing mobile2 object 
		Mobile.Show1(mobile2);
		
	}
	

}
