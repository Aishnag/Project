package com.aishwarya;

public class LocalClassDemo {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
	LocalClassDemo  ob=new LocalClassDemo ();  
		ob.display();  
		}
	}



