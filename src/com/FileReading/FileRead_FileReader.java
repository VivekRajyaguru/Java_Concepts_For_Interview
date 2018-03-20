package com.FileReading;

import java.io.File;
import java.io.FileReader;

public class FileRead_FileReader {

	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader(System.getProperty("user.dir")+File.separator+"Test.txt");
		int i;
		while((i=reader.read()) != -1) {
			System.out.println((char) i);
		}
	}
	
}

/*
 * Class constructor assume that default character encoding and buffer size are appropriate.
 * 
 * 
 * */
 