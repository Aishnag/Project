package com.aishwarya;

public class InnerDemo {


 public static void main(String[] args) {
		AnonymousInnerClassDemo i = new AnonymousInnerClassDemo() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
		   }

		}


