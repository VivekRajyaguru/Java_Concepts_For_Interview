package com.Immutable_Example;

public class MutableClass {
	
	private String s3;
	private String s4;
	
	public MutableClass() {
		
	}
	public MutableClass(String s3, String s4) {
		this.s3 = s3;
		this.s4 = s4;
	}

	public String getS3() {
		return s3;
	}

	public void setS3(String s3) {
		this.s3 = s3;
	}

	public String getS4() {
		return s4;
	}

	public void setS4(String s4) {
		this.s4 = s4;
	}
	
	

}
