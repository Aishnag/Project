package com.exception;

import java.util.Scanner;

public class UsingTryCatchException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int first =scan.nextInt();
		int second = scan.nextInt();
		DivideNumber(first, second);

	}
	
public  static void DivideNumber(int first,int second) {
		
		try {
			int result;
		result = first / second;
		System.out.println("Division of two Numbers is :"+result);
		}
		catch(ArithmeticException ae) {
			System.out.println("can't divide by zero,End the program.");
		}
	}
}
