package com.test02;


	

public class Season {
	
public static void main(String[] args) {
		
		String res = Season.getSeason(11) ;
		System.out.println(res);
	}

	public static String getSeason(int n) {//String 값을 리턴하는

		String res = null; // null을 안쓰면 에러가 뜬다.

		switch (n) {
		case 12:
		case 1:
		case 2:
			res = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			res = "봄";
			break;
		case 6:
		case 7:
		case 8:
			res = "여름";
			break;
		case 9:
		case 10:
		case 11:
			res = "가을";
			break;

		}
		return res;
	}
}
