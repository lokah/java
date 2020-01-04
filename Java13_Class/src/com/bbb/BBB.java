package com.bbb;

import com.aaa.AAA;

public class BBB extends AAA{
//field
	private int b;
	
	public BBB() {
		//super() 부모의 기본 생성자
		//부모의 생성자를 호출하지 않을 경우 super() ;가 부모의 기본 생성자를 자동 호출한다.
		//public AAA() 가 호출된다.
		System.out.println("BBB() 생성");
	}
	
	public BBB(int b) {
		super(b) ;//부모의 생성자를 의미한다. public  AAA(int abc)를 호출하고 있다.
		this.b = b;
		System.out.println("BBB(int b) 생성");
	}
	
	public BBB(int abc, int b) {
		
		
		super(abc) ;//부모의 생성자를 의미한다. public  AAA(int abc)를 호출하고 있다
		this.b = b;
		System.out.println("BBB(int abc, int b) 생성");
		
		
	}
	
	public int getB() {
		return b;
		
	}
	
	public void setB(int b) {
		
		this.b = b;
	}
	
	
	public int getSum() {
		//super - 부모 객체를 의미
		//this - 나 객체를 의미
		int sum = super.getAbc() + this.getB();//이 줄에서 super를 생략해도 된다. 부모의 것이므로,this를 써도 된다. 
		//super 대신해 this를 써도 된다. super thic 모두 안 써도 된다.
		return sum;
		
	}
	
	public void prn() {
		
		System.out.println("BBB의 prn 메서드");
	}
}
