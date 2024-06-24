package com.corejava.inheritanceexample;

public class Inheritance {
	public static void main(String[] args) {
		Child swetha = new Child();
		swetha.childMethod1();
		swetha.childMethod2();
		swetha.commonMethod();//gets from child method
		swetha.parentMethod1();
		swetha.parentMethod2();
		
		Parent sumathi = new Child();
		sumathi.parentMethod1();
		sumathi.parentMethod2();
		sumathi.commonMethod();
		// don't get any child methods but executes common method from child at runtime
		//checks reference when compiling but executes child method in run time
		
		Parent nag = new Parent();
		nag.parentMethod1();
		nag.parentMethod2();
		nag.commonMethod(); //gets from parent method
		
		//Child raji = new Parent(); 
		// type mismatch error can't convert from parent to child suggest to cast
		// After casting as below also throws run time cast exception 
		
		/*Child raji = (Child) new Parent();
		raji.parentMethod1();
		raji.parentMethod2();
		raji.childMethod1();
		raji.childMethod2();
		raji.commonMethod();
		*/
		
		
		
		
	}

}
