package com_test01;

public class NTest {

	//변수에다가 final을 붙이면 상수가 된다.
	//전역변수
	public static final int TEN = 10;
	
	
	public static void main(String[] args) {
		opr01(3);
		//opr02();
		System.out.println(opr02());
		opr03(TEN,1);
		opr04(); //System.out.println(opr04());로도 쓸 수 있다.
		opr05(); //System.out.println(opr05());로도 쓸 수 있다.
		opr06();
		opr07();
	}
	
	//사칙연산
	public static void opr01(int i) {
		System.out.printf("%d + %d = %d \n", TEN, i, TEN + i);
		System.out.printf("%d - %d = %d \n", TEN, i, TEN - i);
		System.out.printf("%d * %d = %d \n", TEN, i, TEN * i);
		System.out.printf("%d / %d = 몫 : %d 나머지 : %d", TEN, i, TEN / i, TEN % i);
	}
	//지역변수
	//public static void opr02(int i) {
		
		// int i = 1; 안된다
		//int TEN = 11;
		//System.out.println(TEN);
		//System.out.println(i);
		
		
	//대입연산(+=, -=, *=, /=)
	
	public static String opr02() {
		
		int i = 0;
		System.out.println(i);
		i = i +TEN;
		System.out.println(i);
		i += TEN; //i = i + TEN;
		System.out.println(i);
		
		i -= 5;
		System.out.println(i);
		return "대입연산 끝!";
		
		
	}
	//증감연산
	//전위 연산자 : 변수 앞에 연산자를 붙여서 연산을 먼저 하고 값을 나중에 리턴한다.
	//후위 연산자 : 변수 뒤에 연산자를 붙여서 값을 먼저 리턴하고 연산을 나중에 한다.
	public static void opr03(int a, int b) {
		System.out.println(a);
		System.out.println(a--); //10(9);
		System.out.println(--a); //8(8);
		int res = a++ + ++a + --a + --b;
		//a=8왜?...8(9) + 10(10) + 9(9) + 0(0) = 27
		System.out.println(res);
		
	}
	
	public static boolean opr04() {
		// & 둘 모두 참이어야 참
		System.out.println(true & true); //true
		System.out.println(true & false); //false
		System.out.println(false & true); //false
		System.out.println(false & false); //false
				// | 둘 중 하나만 참이면 참
	    System.out.println(true | true); //true
		System.out.println(true | false);//true
		System.out.println(false | true); //true
		System.out.println(false | false); //false
		
		//&&
		System.out.println(true && true); //
		System.out.println(true && false);//
		System.out.println(false && true); //
		System.out.println(false && false);
		
			//||
			
		System.out.println(true || true); //
		System.out.println(true || false);//
		System.out.println(false || true); //
		System.out.println(false || false);
		
		int i = 8;
		boolean res = (TEN > i)&&(5 < i);
		
		return true;
		
	}
	//비교연산
	public static void opr05() {
		
		System.out.println("..............");
		System.out.println(true == false); 
		System.out.println(5 != 6); //!같지 않다는 기호
		
	
	}
	//삼항 연산, 같은 타입이어야 한다. 인트면 인트, 스트링이면 스트링
	//(조건) ? 참 : 거짓;
	public static boolean opr06() {
		int a = 2;
		int b = 3;
		int i = (a > b) ? a + b : a - b;
		System.out.println(i);
		
		boolean res = false;
		res = (a < b) ? false : true;
		//System.out.println(i);
		
		String s = (a > b) ? "a가 b보다 크다." : ((a < b) ? "a가 b보다 작다." : "a와 b가 같다.");
		System.out.println(s);
		return res;
		
		
	}
	//비트 연산 : &, |, <<, >>, ~, ^
	public static void opr07() {
		
		int a = 10;
		//0000 0000 0000 0000 0000 0000 0000 1010;
		int b = 2;
		//0000 0000 0000 0000 0000 0000 0000 0010;
		
		System.out.println(a & b);//숫자 숫자랑 연결하면 비트연산
		//0000 0000 0000 0000 0000 0000 0000 0010; 거짓
		//연산된 결과가 십진수로 출력된다.
		System.out.println(a | b);
		//0000 0000 0000 0000 0000 0000 0000 1010; 
		System.out.println("...............");
		
		//시프트 연산
		int c = TEN;
		
		System.out.println(Integer.toBinaryString(c >> 2));
		//0000 0000 0000 0000 0000 0000 0000 0010; //010  앞의 0은 생략되어 출력된다.
		System.out.println(Integer.toBinaryString(c << 4));
		System.out.println(c << 4);
	}
	
}
