package com_test02;

public class TypeToType01 {
	
	public static void main(String[] args) {
		// 형변환
		//묵시적 형변화 (upCasting / promotion) : 작은 타입 - 큰 타입으로
		byte b01 = 100;
		int i01 = b01;
		System.out.println(i01);
		
		//명시적 형변환 (downCasting / casting) : 큰 타입 - 작은 타입으로 변환
		int i02 = 100;
		byte b02 = (byte)i02;
		
		System.out.println(b02);
	}

}
