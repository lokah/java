package com.test02;

public class Cat extends Animal{

	public Cat() {
		System.out.println("고양이") ;
	}
	
	
	//@Override : 재정의->상속받은 부모의 메서드를 자식이 확장하거나 변형할 때 사용한다.
	public void bark() {
		System.out.println("야옹");
	}
}
