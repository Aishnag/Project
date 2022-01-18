package com.ooppillar;

public abstract class Shape_Abstraction {
	String color; 
    abstract double area(); 
    public abstract String toString(); 
    public Shape_Abstraction(String color) 
    { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
} 


