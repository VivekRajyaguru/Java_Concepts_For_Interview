package com.CustomSingleTonClass_Example_3;

public class CustomSingleTon3 {

	private static CustomSingleTon3 object = new CustomSingleTon3();
	public String str;
	
	private CustomSingleTon3() {
		str = "Hi...Welcome";
	}
	
	public static CustomSingleTon3 getInstance() {
		return object;
	}
	 
}
