package com.string.array;

import java.util.Scanner;

public class StringArray {
	public static void main(String[] args) {
		
     int num;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of Student: ");
	num=scan.nextInt();
	String []name = new String[num];
	
	for (int counter = 0; counter < num; counter++) {
	System.out.println("Enter the name of Student:"+(counter+1));
		name[counter]=scan.next();
		
	}
	scan.close();
	System.out.println("Names of Student :");
	for (int counter = 0; counter < num; counter++) {
		System.out.println(name[counter]);
		

	}}
}