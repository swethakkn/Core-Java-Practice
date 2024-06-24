package com.corejava.needofinterfaces;
interface Computer{
	void code();
}
class Laptop implements Computer{
	public void code() {
		System.out.println("code,compile,run...");
	}
}
class Desktop implements Computer{
	public void code() {
		System.out.println("code,compile,run... faster");
	}
}
class Developer{
	public void devApp(Computer comp) {
		comp.code();
	}
}
public class NeedOfInterfaces {
	public static void main(String[] args) {
		Laptop lap = new Laptop();
		Desktop desk = new Desktop();
		Developer swetha  = new Developer();
		swetha.devApp(desk);
		swetha.devApp(lap);
	}

}
