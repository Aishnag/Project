package com.stringconversion;

public class StringConversion {
public static void main(String[] args) {
	

	//conversion	
	System.out.println("\n");
	System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
	
	String str = "Happy"; 
    
    // conversion from String object to StringBuffer 
    StringBuffer sbr = new StringBuffer(str); 
    sbr.reverse(); 
    System.out.println("String to StringBuffer");
    System.out.println(sbr); 
      
    // conversion from String object to StringBuilder 
    StringBuilder sbl = new StringBuilder(str); 
    sbl.append("learning."); 
    System.out.println("String to StringBuilder");
    System.out.println(sbl);              		
}


}
