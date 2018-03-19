package com.CustomSingleTonClass_Example;

public class CustomSingleTon {

	private static CustomSingleTon classInstance = null;
	
	public String str;
	
	private CustomSingleTon() {
		str = "Hello World. I am SingleTon";
	}

	public static CustomSingleTon getClassInstance() {
		if (classInstance == null) classInstance = new CustomSingleTon();
		
		return classInstance;
	}	
	
}
