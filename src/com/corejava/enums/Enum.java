package com.corejava.enums;

/* Enum is short for "enumerations", which means "specifically listed".
 * An enum is a special "class" that represents a group of constants 
 *(unchangeable variables, like final variables).
 *To create an enum, use the enum keyword (instead of class or interface),
 * and separate the constants with a comma. Note that they should be in 
 * upper case letters generally not compulsory
 * You can access enum constants with the dot syntax
 * You can also have an enum inside a class
 * Enums are often used in switch statements to check for corresponding values
 * The enum type has a values() method, which returns an array of all enum constants.
 *  This method is useful when you want to loop through the constants of an enum
 *  You can also have an enum inside a class but we can't extends enum class
*/
enum Speed{
	LOW,
	Medium,
	HIGH // named constants
}
public class Enum {
	public static void main(String[] args) {
		
		Speed speed = Speed.HIGH;
		System.out.println(speed);
		System.out.println(speed.ordinal()); // gives the order/index of value
		//to print all constants 
		Speed[] s = Speed.values(); // gives all constants in array
		for(Speed value : s) { // enhanced for loop
			System.out.println(value + ":" + value.ordinal());
		}
		//switch statement also we can use if statement
		switch (speed) {
		case LOW :
			System.out.println("Speed is LOW");
			break;
		case HIGH:
			System.out.println("Speed is HIGH");
			break;
		case Medium:
			System.out.println("Speed is Medium");
			break;
		default:
			System.out.println("No speed at all");
			break;
			
		
		}
			
		
	}

}
