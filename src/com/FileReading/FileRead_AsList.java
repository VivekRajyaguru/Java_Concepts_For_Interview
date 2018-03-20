package com.FileReading;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FileRead_AsList {

	public static void main(String[] args) throws Exception {
		List<String> list = readFileAsList(System.getProperty("user.dir")+File.separator+"Test.txt");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static List<String> readFileAsList(String fileName) throws Exception {
		List<String> lines = Collections.emptyList();
		lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		return lines;
	}
	
}
/*
 * Read all lines from File. This Method ensures that file is closed when all bytes has read or erro occured.
 * Bytes from the file are decoded into characters using the specified charset.
 * 
 * */
