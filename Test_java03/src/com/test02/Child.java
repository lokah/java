package com.test02;

public class Child extends Parent {

	public void out() {
		
		
		System.out.println("자식 클래스 메소드");
	}
	
	@Override
	public void display() {
		
		System.out.println("상속 받아 재정의한 메소드");
	}
}
