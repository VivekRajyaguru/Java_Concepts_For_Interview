package com.CustomSingleTonClass_Example_4;

public class CustomSingleTon_4 {

	private volatile static CustomSingleTon_4 object;
	
	public String str;
	
	private CustomSingleTon_4() {
		str = "Hi... Welcome";
	}
	
	public static CustomSingleTon_4 getInstance() {
		if (object == null) {
			synchronized (CustomSingleTon_4.class) {
				if (object == null) {
					object = new CustomSingleTon_4();
				}
			}
		}
		return object;
	}
	
}

/*
 * Custom Single Ton Implementation using Double Checking Method
 * Once object is created synchronization is no longer useful as object is not null
 * so we only acquire lock on getInstance only when object is null
 * When we declared object as volatile it ensures that multiple threads offer the object correctly.
 * it will reduce overhead of calling synchronized method every time.  
 * 
 * 
 */
 