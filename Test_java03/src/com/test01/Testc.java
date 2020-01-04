package com.test01;

public class Testc extends Testp{

	private int x = 100;
	public Testc() {
		
		
	}
	
	public void out() {
		
		
		System.out.println("부모의 protected num 필드 :" + num);
		System.out.println("자식 클래스 메소드");
	}
	
	@Override
	
	public void display() {
		
		System.out.println("상속받아 재정의한 메소드");
	}
}
