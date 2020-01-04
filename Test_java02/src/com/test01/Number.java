package com.test01;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number num1 = new Number();
		System.out.println(num1.getNumber());

		Number num2 = new Number();

		System.out.println(num2.getNumber());

	}

	int num;

	public Number() {
		num = 10;
		System.out.println("생성자호출!");
		

	}
	
	public int getNumber() {
		
		return num ;
	}
}
