package com_test03;

public class MyCalc {
	
	//접근제한자 메모리영역 리턴타입 메소드이름(파라미터) {}
	
	//파라미터 :  메소드 외부에서 전달된 값을 받아서 메소드 내부에서 사용하기 위한 변수.
	public static void sum(int i, int j) {
		int res = i + j;
		System.out.println(i + "+" + j + "=" + res);
				
	}

	
	public static int sub(int i, int j) {
		
		int res = i - j;
		
		return res;
		
	}
	
	public static double nul(double i, double j) {
		
		double result = i + j;
		
		return result;
		
	}
	
	public static void div(int i, int j) {
	int mok = i / j;
	int namergi = i % j;
	
	System.out.printf("%d / %d 의 몫 : %d \n", i, j, mok);
			
    System.out.printf("나머지 : %d", namergi);
}
}