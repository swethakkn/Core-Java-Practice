package com.corejava.methods;

public class Computer {
	
	public void playMusic() {
		System.out.println("Music Playing...");
	}
	
	public String getAPen(int cost) {
		if (cost>=10)
			return "Pen";
		return "No Pen is available";
		
	}

}
