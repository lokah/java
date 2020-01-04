package com.test02;

public class Refer00 {
	
	
	
	static  int _value(int b) {
		
		b = 2;
		return b;
	}
	
	public static void runValue() {
		int a = 1;
		_value(a) ;
		System.out.println("runvalue, " + _value(a) +":" + a);//2
		
	}
	
	static void refer01(A b) {
		
		b = new A(2);
	}
	
	public static void runrefer() {
		
		A a = new A(1);
		refer01(a);
		System.out.println("runfer, " + a.id);//2
	}
	
	static void refer02(A b) {
		
		b.id = 2;
	}
	
	public static void runrefer1() {
		
		A a = new A(1);
		refer02(a);
		System.out.println("runfer1," + a.id);//2
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		runValue();
		runrefer();
		runrefer1();
		
		
		
		
	}

}
