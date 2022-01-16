package com.array;

public class ArrayDemo {
	public static void main(String[] args) {

		//single-dimensional array
		int a[]= {40,50,60,70,80};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9} };
		      
		      System.out.println("\nLength of row 1: " + b[0].length);
		      System.out.println("Length of row 2:"+b[1].length);
		      }

}
