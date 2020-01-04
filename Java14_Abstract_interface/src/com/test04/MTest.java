package com.test04;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal some = new Cat();
		some.bark();
		some.eat("참치");

		Dog dog = new Dog();
		dog.bark();
		dog.eat("뺘다귀");
		dog.bite();
		
		Eagle eagle = new Eagle();
		eagle.bark();
		eagle.eat("쥐");
		eagle.fly();
	}

}
