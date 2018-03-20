package com.FileReading;

import java.io.File;
import java.util.Scanner;

public class FileRead_Scanner {

	public static void main(String[] args) throws Exception {
		File file = new File(System.getProperty("user.dir")+File.separator+"Test.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}
	
}

/*
 * Simple Text Scanner which can parse primitive types and string using regular expression.
 * scanner breaks its input into tokens using a delimiter pattern which by default matches whitespace.
 * */
