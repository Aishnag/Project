package com.constructor;

public class ParameterizedDemo {
public static void main(String[] args) {
	Employee emp= new Employee(1,"Alex");
	Employee emp1 = new Employee(2, "Ram");
	emp.display();
	emp1.display();
}
}
