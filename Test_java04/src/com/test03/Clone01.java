package com.test03;

public class Clone01 implements Cloneable {

	String name;
	
	Clone01(String name) {
		
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
}
