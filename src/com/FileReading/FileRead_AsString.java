package com.FileReading;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileRead_AsString {

	public static void main(String[] args) throws Exception {
		String data = readFileAsString(System.getProperty("user.dir")+File.separator+"Test.txt");
		System.out.println(data);
	}
	
	public static String readFileAsString(String fileName) throws Exception {
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)));
		return data;
	}
}
