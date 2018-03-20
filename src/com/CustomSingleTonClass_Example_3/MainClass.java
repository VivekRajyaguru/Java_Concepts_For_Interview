package com.CustomSingleTonClass_Example_3;

public class MainClass {

	public static void main(String[] args) {
		CustomSingleTon3 object = CustomSingleTon3.getInstance();
		CustomSingleTon3 object2 = CustomSingleTon3.getInstance();
		
		System.out.println(object.str);
		object.str = object.str.toUpperCase();
		System.out.println(object2.str);
		
	}
	
}

/*
 *Custom Single Ton Class Using Eager initializer.
 *JVM executes static initializer when class is loaded so its guaranteed to be thread safe.
 *But Use this approach only when class is light.
 * 
 * 
 */
 