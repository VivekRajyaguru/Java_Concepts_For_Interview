package com.CustomSingleTonClass_Example_2;

public class CustomSingleTon2 {

	private static CustomSingleTon2 object;
	
	public String str;
	
	private CustomSingleTon2() {
		str = "Hi...";
	}
	
	public static synchronized CustomSingleTon2 getInstance() {
		if (object == null) {
			object = new CustomSingleTon2();
		}
		return object;
	}
	
}
