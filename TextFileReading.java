package com.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFileReading {
	public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("MyFile.txt");
            InputStreamReader reader = new InputStreamReader(inputStream, "UTF-8");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
