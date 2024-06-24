package com.corejava.accessmodifierspackage2;

public class AccessModifier2 {
	 protected int marks =10;
	
	  public void show() {
		  System.out.println("Package2 public - Show");
	  }
	  //default is used only with in the package
	  void defaultshow() {
		  System.out.println("Package2 default - Show");
	  }
	 

}

