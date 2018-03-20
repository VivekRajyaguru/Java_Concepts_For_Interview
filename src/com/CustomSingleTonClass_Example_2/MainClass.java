package com.CustomSingleTonClass_Example_2;

public class MainClass {

	public static void main(String[] args) {
		CustomSingleTon2 object = CustomSingleTon2.getInstance();
		CustomSingleTon2 object2 = CustomSingleTon2.getInstance();
		
		System.out.println(object.str);
		object.str = object.str.toUpperCase();
		System.out.println(object2.str);
	}
		
}

/*
 *Single Class Using Synchronized Approach  
 * it makes thread safe but disadvantage is it's using synchronized every time creating object
 * it may decrease performance and critical to application
 * 
 * */