package com.test03;
//인터페이스는 만들어지는 모든 메소드가 추상 메소드
//private을 쓰면 안된다. 상속받아서 써야 하는데 상속받을 수 없으므로...
public interface Animal {

	
	public void bark() ;
	void eat(String feed);
	
	
}
