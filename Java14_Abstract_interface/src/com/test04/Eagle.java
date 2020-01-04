package com.test04;


//클래스는 1개만 상속 가능, 인터페이스는 여러 개가 가능하다
public class Eagle extends Animal implements Bird {

	@Override
	public void fly() {
		
		System.out.println("파닥파닥");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("피오오");
	}

}
