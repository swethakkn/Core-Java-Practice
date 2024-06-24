package com.corejava.trywithresources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryFinallyWithResources {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		BufferedReader  enteredvalue = null;
		try {
			enteredvalue = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(Integer.parseInt(enteredvalue.readLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		finally {
			try {
				enteredvalue.close();
				System.out.println("Resource closed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
