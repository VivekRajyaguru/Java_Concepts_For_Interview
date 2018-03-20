package com.FileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class FileRead_BufferedReader {
	
	public static void main(String[] args) throws Exception {
		File file = new File(System.getProperty("user.dir")+File.separator+"Test.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String str;
		while((str = reader.readLine()) != null) {
			System.out.println(str);
		}
	}
	
}
/*
 * Reads text from character input-stream. it does buffering for efficient reading of characters, arrays and lines.
 * buffer size may be specified but default size if big enough for large data purpose. 
 * 
 * 
 */
