package com_test01;

public class Type04 {

	//문자형, 문자열, 논리형
	public static void main(String[] args) {
		
		// 문자형 '' char(2)
		char c01 = 'a';
		System.out.println(c01);
		
		char c02 = 'b';
		char sumC = (char) (c01 + c02);
		System.out.println(sumC);
		
		// 문자열 "" String(참조타입이지만 기본타입처럼 사용 가능)
		String s01 = "a";
		String s02 = "bc";
		String sumS = s01 + s02;
		System.out.println(sumS);
		
		//unicode 도 가능
		char lastName = '\uae40';
				
		System.out.println(lastName);
		String firstName = "\uc7ac\uacbd";
		System.out.println(firstName);
		
		//
		System.out.println("....................");
		
		//논리형 boolean(1)
		boolean b01 = true;
		boolean b02 = false;
		System.out.println(b01);
		System.out.println(b02);
		
		
	}
}
