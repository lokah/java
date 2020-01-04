package com.test02;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		
		Cat cat = new Cat() ;
		cat.bark();
		Dog dog = new Dog() ;
		dog.bark();
		
		*/
		
		/*다형성은 다음과 같은 특징
		 * 1.부모의 타입으로 자식 객체를 생성할 수 있다.
		 * Parent p = new Child();
		 * 
		 * 2.부모의 타입으로 자식을 대입할 수 있다.
		 * Child c = new Child();
		 * Parent p =c ;
		 * 
		 * 3. 부모의 메서드를 통해 자식 메소드를 호출
		 * 
		 * * 같은 부모 클래스를 가지고 있는 자식 클래스는 컴파일 시에는 형 변환이 가능하지만
		 * 런타임 시는 ClassCastException 을 발생시킨다.
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		Animal some = null;
		some = new Dog();
		some.bark();
		
		some = new Cat();
		some.bark();
		
		//dog 의 주소값이라면
		if(some instanceof Dog) {
			
			System.out.println("멍멍이다");
		}else if(some instanceof Cat) {
			
			System.out.println("고양이다");
		}
	}

}
