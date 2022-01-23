package com.aishwarya;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIODemo {

	public static void main(String[] args) {

		try {
			// create a printwriter object
			PrintWriter out = new PrintWriter("Work.txt");
			
			// write a data to file
			
			out.println("This is the way to write to files...");
			out.println("On the next line");
			out.println(" This is good...");
			
			out.flush();
			out.close();
			//For reading 
			BufferedReader reader = new BufferedReader(new FileReader(new File("Work.txt")));
			
			String str ="";
			StringBuilder sb = new StringBuilder("");
			
//			Read from the file
			while((str = reader.readLine()) != null) {
				sb.append(str);
			}
			
			System.out.println("Data from file : ");
			
			System.out.println(sb);
			
//			Close the reader
			reader.close();
			
		} catch ( IOException e) {
			System.out.println("Issues : "+e.getMessage());
		}
		

	}

}
