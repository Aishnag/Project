package com.ooppillar;

public class ForClassessAndObjects {
	public static void main(String[] args) {
Animal animal = new Animal("dog"," bread", 3,"black");
   System.out.println(animal.toString());
}}

 class Animal{
	String name; 
    String breed; 
    int age; 
    String color;
	public Animal(String name, String breed, int age, String color) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	} 

}