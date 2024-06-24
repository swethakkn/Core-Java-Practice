package com.corejava.objectclass;

import java.util.Objects;

//Every class in java extends Object class
class Laptop{
	String model;
	int price;
	/*
	 * // Overriding the toString method Object Class or by generating the tostring
	 * method public String toString(){ return model +":" + price; }
	 */
	
	/*
	 * public Boolean equals(Laptop that) { return this.model.equals(that.model)&&
	 * this.price == that.price;
	 * 
	 * }
	 * 2 object are equal when we compare their values.so its better not to
	 * write your own equals method. just generate hashcode and equals from source
	 * by selecting the required variables.
	 */
	
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}
	
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
}
public class ObjectClass {
	public static void main(String[] args) {
		Laptop obj1 = new Laptop();
		obj1.model = "Lenova";
		obj1.price = 1000;
		System.out.println(obj1);
		// everytime when u try to print the object it calls toString method as below
		//System.out.println(obj1.toString());
		Laptop obj2 = new Laptop();
		obj2.model = "Lenova1";
		obj2.price = 1000;
		System.out.println(obj2);
		System.out.println(obj1.equals(obj2));
		//results false bcause equals method of object class compares hexadecimal
		//of object. so to compare we have to override the equals method
		System.out.println(obj2.hashCode());
		 
		
	}
  

}
