package com.CustomSingleTonClass_Example_4;

public class MainClass {

	public static void main(String[] args) {
		CustomSingleTon_4 object = CustomSingleTon_4.getInstance();
		CustomSingleTon_4 object2 = CustomSingleTon_4.getInstance();
		
		System.out.println(object.str);
		object.str = object.str.toLowerCase();
		System.out.println(object2.str); 
		
	}
	
}
