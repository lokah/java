package com_test02;

public class TypeToType03 {

	
	public static void main(String[] args) {
		//boxing 래퍼 클래스 안에 값을 넣는다
		Integer i = new Integer(100);
		System.out.println(i);
		//unboxing은 레퍼클래스에서 값을 꺼내온다
		
		// 명시적
		int j = i.intValue();
		System.out.println(j);
		//묵시적
		int k = i;
		System.out.println(k);
	}
}
