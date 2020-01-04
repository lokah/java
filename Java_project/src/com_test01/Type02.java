package com_test01;

public class Type02 {

	// 정수형 리터럴 : byte(1)   short(2)  int(4)  long(8)
	// long - 접미사 l/L
	public static void main(String[] args) {
	   //Type 변수 = 값;
		
		byte b01 = 126;
		
		System.out.println(b01);
		byte b02 = (byte) 128;			// casting(형 변환) -  자바에서 정수형의 기본값은 int
		System.out.println(b02);
		byte sumB = (byte) (b01 + b02); //연산의 기본도 int
		System.out.println(sumB);
		System.out.println("...............");
		
		short s01 = 32767;
		System.out.println(s01);
		short s02 = 2;
		System.out.println(s02);
		short sumS = (short) (s01 + s02);
		System.out.println(sumS);
		System.out.println("...................");
		
		int i = 10;
		int j = 20;
		System.out.println(i);
		System.out.println(j);
		int sum = i + j;
		System.out.println(sum);
		
		long l01 = 3000000000l;
		long l02 = 4000000000l;
		long suml = l01 + l02;
		System.out.println(suml);
		System.out.println("..........");
		
		// 0b : 2진수
		System.out.println(0b10);
		// 00 : 8진수
		System.out.println(0010);
		// 0x : 16진수
		System.out.println(0x10);
		
		short s011 = 32767;
		System.out.println(s011);
		short s021 = 2;
		System.out.println(s021);
		short sumS1 = (short) (s011 + s021);
		System.out.println(sumS1);
	
	}
}
