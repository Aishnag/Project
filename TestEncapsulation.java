package com.ooppillar;

public class TestEncapsulation {

	public static void main(String[] args) {
        ForEncapsulate obj = new ForEncapsulate(); 
        obj.setName("Harsh"); 
        obj.setAge(19); 
        obj.setRoll(51); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      


	}

}
