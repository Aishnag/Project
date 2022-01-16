package com.aishwarya.typecasting;

public class TypeCasting{
public static void main(String[] args) {
	System.out.println("Implicit Type Casting.");
	char a='A';
	System.out.println("Value of a :"+a);
	int b=a;
	System.out.println("value of b:"+b);
	float f=a;
	System.out.println("value of f:"+f);
	long l=a;
	System.out.println("value of l:"+l);
	double d= a;
	System.out.println("value of d:"+d);

	System.out.println("\n");
	System.out.println("Explicit Type Casting.");
	double  x=35.78;
     int y = (int) x;
     {
    	System.out.println("value of x:"+x);
    	System.out.println("value of y:"+y);
    	
     }
}
	
	
}
