package com.test01;

public abstract class Animal {

	//추상 클래스 : 추상 메서드를 하나 이상 가진 클래스
	
	public abstract void bark();//중괄호가 없다. {}
	//추상 메서드 : 상속받는 자식 클래스에서 반드시 구현다도록 강제
	//body가 없다.//
	
	public void eat(String feed) {
		
		System.out.println(feed + "먹는다.");
		
	}
}
