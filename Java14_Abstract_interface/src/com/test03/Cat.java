package com.test03;

//클래스가 클래스를 상속받을 때는 extends
//클래스가 인터페이스를 상속받을 때는 implements
//인터페이스가 인터페이스를 상속받을 때는 다시 extends 가 된다.
//인터페이스가 부모인 클래스를 상속받을 수 없다.

public class Cat implements Animal {

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}

	@Override
	public void eat(String feed) {
		// TODO Auto-generated method stub
		System.out.println("고양이가 " + feed +" 먹는다.");
	}

}
