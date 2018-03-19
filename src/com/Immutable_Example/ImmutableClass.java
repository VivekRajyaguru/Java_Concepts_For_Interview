package com.Immutable_Example;

public final class ImmutableClass {

	protected final String s1;
	protected final String s2;
	protected final MutableClass mutableObject;
	
	public ImmutableClass(String s1, String s2, MutableClass mutableObject) {
		this.s1 = s1;
		this.s2 = s2;
		MutableClass cloneObject = new MutableClass();
		cloneObject.setS3(mutableObject.getS3());
		cloneObject.setS4(mutableObject.getS4());
		this.mutableObject = cloneObject;
	}

	public String getS1() {
		return s1;
	}

	public String getS2() {
		return s2;
	}

	public MutableClass getMutableObject() {
		MutableClass cloneObject= new MutableClass();
		cloneObject.setS3(this.mutableObject.getS3());
		cloneObject.setS4(this.mutableObject.getS4());
		return cloneObject;
	}
	
	
	
}

// Steps For Creating Immutable Class
/*
 * 1. Make Class Final. so No Class can override it.
 * 2. Make All Fields Final and Initialze them from Constructor
 * 3. Hide Setter Method or Just Create Getters only.
 * 4. When Exposing Any Method which Change State/value of Class Objects then always return new Instance of Class
 * 5. If Class has Any Mutable Objects than while returning always return clone copy of that mutable object.
 * */

