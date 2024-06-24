package com.corejava.multidimensionalarray;

public class ArrayMultiDimension {
	public static void main(String[] args) {
		int nums[][]= new int[3][4];
		/*
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				// * 100 to get 2 digits and Math.random returns double type
				//so casting is necessary as (int)
				nums[i][j] = (int)(Math.random() * 10); 
				//everytime you run you will get a random number
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}*/
		
		// using enhanced for loop printing the same
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				nums[i][j] = (int)(Math.random() * 10); 
			}
		}
		for(int n[]:nums) {
			for(int m: n) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
		
	}

}
