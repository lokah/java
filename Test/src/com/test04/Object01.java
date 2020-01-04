package com.test04;

public class Object01 {

	public static void main(String[] args) {
		
		
		Object02 obj = new Object02 () ;
		
		System.out.println("메소드호출전 : " +obj.getObject());
		getAt(obj) ;
		System.out.println("메소드호출후 : " +obj.getObject());

	}

	public static void getAt(Object02 attah) {
		attah.getAdd(12);
		
		
	}
}
