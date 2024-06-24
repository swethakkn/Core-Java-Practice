package com.corejava.multidimensionalarray;

public class Array3D {
	public static void main(String[] args) {
		int nums[][][]= new int[3][4][2];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<2;k++) {
					nums[i][j][k] = (int)(Math.random() * 10);
				}
				 
			}
		}
		for(int n[][]:nums) {
			for(int m[]: n) {
				System.out.print("(");
				for(int l:m) {
					System.out.print(l + " ");
				}
				System.out.print(")");
				
			}
			System.out.println();
		}
		
	}

}
