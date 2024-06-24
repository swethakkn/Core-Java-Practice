package com.corejava.enumclass;
enum Laptop{
	
	MacBook(2000), XPS(1200), DellInspiron, Thinkpad(1000);
	// all are private bcoz we use these in the same class object 
	private int price; 
	// constructor without field for assigning default price
	private Laptop() {
		this.price = 800;
	}
	// constructor with price field to 
	private Laptop(int price) {
		this.price = price;
	}
	// getters and setters for price because of private constructors
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class Enumclass {
	public static void main(String[] args) {
		for (Laptop lap : Laptop.values())
			System.out.println(lap + ":" + lap.getPrice());
	}

}
