package com.aaa;

//오브젝트를 상속받고 있는 클래스
public class AAA {
	// filed 헤딩 클래스의 속성
	private int abc;

	// dafault 생성자(기본 생성자), 생성자가 있어야 인스턴스를 만들 수 있다.
	public AAA() {

		System.out.println("AAA() 생성");

	}

	public AAA(int abc) {

		this.abc = abc;// 해당 값으로 필드를 채워준다.
		System.out.println("AAA(abc) 생성");
	}

	// getter & setter
	public int getAbc() {// abc필드의 값을 가져온다.

		return abc;
	}

	public void setAbc(int abc) {// abc의 필드에 값을 넣어준다.

		this.abc = abc;
	}

	public void prn() {
		System.out.println("AAA의 prn");
	}

	/*
	 * <생성자> 1.클래스의 이름과 동일하되, 리턴타입은 없고, 객체 생성시의 접근제한자는 public이다.
	 * 
	 * class Test{ 생성자는 public Test() {//생성자 }
	 * 
	 * 2. 생성자는 객체 생성을 하는 new 연산자와 함게 사용되며, 생성시 단 한번만 자동 호출된다.
	 * 
	 * Test t = new Test;
	 * 
	 * 3.메서드처럼 객체 및 클래스명으로 호출될 수 없다. t.Test() ; 에러 Test.Test();에러
	 * 
	 * 4.overload 할 수 있다.
	 * 
	 * class Test {
	 * 
	 * public Test() {}//파라미터 없는 것을 기본 생성자.default constructor public Test(int a) {}
	 * public Test(int a, int b){}
	 * 
	 * 
	 * 5. 생성자를 명시하지 않으면 자바가 기본 생성자를 제공하여 필드를 초기화 하고 명시된 생성자를 선언하게 되면 명시 생성자만 호출되고 기본
	   *  생성자는 제공되지 않는다.
	 * 
	 * class AA{
	 * 
	 * //new AA() ; 가능}
	 * 
	 * class BB{ public BB(){} //new BB();
	 * 
	 * class CC{ public CC(int cc){} //new CC();X-> new CC(10);}
	 * 
	 * 
	 * 6.생성자는 상속되지 않는다.
	 * 
	 * 7.생성자는 내부 호출이 가능하며 키워드는 this()이다
	 * 
	 * 8.생성자의 목적은 객체 생성과 필드 초기하에 있다.
	 * 
	 * 
	 * 
	 * 
	 */
}
