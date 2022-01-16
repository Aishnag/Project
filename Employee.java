package com.constructor;
//parameterized constructor

public class Employee {
	
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

 void display() {
	System.out.println(id+" "+name);
	}


}
