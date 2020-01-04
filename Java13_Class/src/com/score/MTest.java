package com.score;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Score lee = new Score() ;
		lee.setName("이순신");
		lee.setKor(100);
		lee.setEng(23);
		lee.setMath(75);
		
		
		Score hong = new Score("홍길동", 58,90,17);
		
		
		System.out.println(lee);
		System.out.println(hong);
	}

}
