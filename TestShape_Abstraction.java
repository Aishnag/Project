package com.ooppillar;

public class TestShape_Abstraction {
    public static void main(String[] args) 
    { 
        Shape_Abstraction s1 = new Circle("Red", 2.2); 
        Shape_Abstraction s2 = new Rectangle("Yellow", 2, 4);
        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 
    } 

}
