package com.Immutable_Example;

public class MainClass {

	public static void main(String[] args) {
		MutableClass mutableObject = new MutableClass("123", "456");
		
		ImmutableClass obj = new ImmutableClass("Vivek", "Test", mutableObject);
		System.out.println("S1:- "+obj.getS1() + " S2:- "+obj.getS2()+ " S3:- "+obj.getMutableObject().getS3() + " S4:- "+obj.getMutableObject().getS4());
		
		obj.getMutableObject().setS3("test");
		System.out.println("S1:- "+obj.getS1() + " S2:- "+obj.getS2()+ " S3:- "+obj.getMutableObject().getS3() + " S4:- "+obj.getMutableObject().getS4());
	}
	
}
