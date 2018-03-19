package com.CustomSingleTonClass_Example;

public class MainClass {

	public static void main(String[] args) {
		CustomSingleTon object = CustomSingleTon.getClassInstance();
		CustomSingleTon object2 = CustomSingleTon.getClassInstance();
		
		System.out.println(object.str);
		object.str = object.str.toUpperCase();
		System.out.println(object.str.toUpperCase());
		
		System.out.println(object2.str);
		
	}
	
}
