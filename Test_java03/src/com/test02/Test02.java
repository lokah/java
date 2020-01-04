package com.test02;

public class Test02 extends Test01 {

	
	private String subject;
	
	
	public Test02() {
		super();
		
	}
	
	public Test02(String subject) {
		
		super();
		this.subject = subject;
		
	}
	
	public Test02(String name, String subject) {
		
		
		super(name);
		this.subject = subject;
	}

	@Override
	public void out() {
		// TODO Auto-generated method stub
		
		
		System.out.println(getName() + "학생입니다.");
		System.out.println(subject + "을 수강합니다.");
	}
	
	
	
}
