package com.test01;

public class NTest01 {
	
	
	
	
	public  void prn03() {

		char c = 'b';

		switch (c) {

		case 'a':
			System.out.println("a입니다.");
			break ;
		case 'b':
			System.out.println("b입니다");
			break ;
		case 'c':
			System.out.println("c입니다.");
			break ;

		}

	}
	

	public static void prn02() {
		// TODO Auto-generated method stub

		switch (6 / 3) {
		case 1:
		case 3:
			System.out.println("홀수입니다.");
		case 2:
		case 4:
			System.out.println("짝수입니다.");
			break;

		default:
			System.out.println("다른 숫자 입니다.");
		}
	}

	public static void prn01() {
		// switch :해당 case로 점핑 후 fall through.
		int i = 3;

		switch (i) {

		case 1:
			System.out.println("1입니다");
			break ;
		case 2:
			System.out.println("2입니다");
			break ;
		case 3:
			System.out.println("3입니다.");
			break ;
		case 4:
			System.out.println("4입니다.");

			break;
		}
	}
}
