package com.test02;

public class Test03 extends Test01 {
	
	private String major ;
	
	public Test03() {
		
		
		super();
	}
	
	public Test03(String major) {
		
		
		super();
		this.major = major;
	}
	
	public Test03(String name, String major) {
		
		
		super(name);
		this.major = major;
	}

	@Override
	public void out() {
		// TODO Auto-generated method stub
		
		System.out.println(getName() + "교수입니다");
		System.out.println(major + "을 전공합니다.");
	}

	
}
