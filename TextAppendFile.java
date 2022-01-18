package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class TextAppendFile {
	 public static void main(String[] args) {

	        String path = System.getProperty("user.dir") + "/home/aishwaryanagare/eclipse-workspace/";
	        String text = "Added text";

	        try {
	            FileWriter fw = new FileWriter(path, true);
	            fw.write(text);
	            fw.close();
	        }
	        catch(IOException e) {
	        }
}
	 }
