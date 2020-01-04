package com.test01;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal cat = new Cat() ;
		Animal dog = new Dog() ;
				cat.bark();
				dog.bark();
				
				cat.eat("참치");
				dog.eat("뻐댜귀");
				//추상 클래스는 객체 생서 불가하다.
				// Animal some = new Animal();
	}

}
