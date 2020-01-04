package com.test01;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Create num1 = new Create();
		System.out.println(num1.getNumber());

		Create num2 = new Create();

		System.out.println(num2.getNumber());

	}

	int num;

	public Create() {
		num = 10;
		System.out.println("생성자호출!");
		

	}
	
	public int getNumber() {
		
		return num ;
	}
}
		
		
	


