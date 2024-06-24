package com.corejava.trywithresources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// trywithresources will automatically close the resources
public class TryWithResouces {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a value:");
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println(Integer.parseInt(br.readLine()));
		}
	}

}
