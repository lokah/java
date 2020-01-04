package com_test03;

public class Ntest {

	public static void main(String[] args) {
		//아규먼트 : 메소드 외부에서 전달되는 값
		
		MyCalc.sum(10, 3);
		
		int res = MyCalc.sub(10, 3);
		System.out.println("sub(5,4) 호출하고 리턴된 결과값 :" + res);
		
		double result = MyCalc.nul(10.3, 3.6);
		System.out.println("10.3 + 3.6");
		
		int i = 10;
		int j = 3;
	    MyCalc.div(i, j);
	}
}
