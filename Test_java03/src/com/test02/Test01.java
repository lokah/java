package com.test02;

public abstract class Test01 {

	private String name;

	public Test01() {

	}
	public Test01(String name) {
		
		this.name = name;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public abstract void out();
}
