package com.plus;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		// 두자리 이상 숫자를 입력하면 각 자리수를 모두 더해서 리턴받아 출력하자
		
		
		System.out.println(plus(sc.nextInt())) ;
	}

	public static int plus(int i) {
		
		int a = (i/1000)%10 ;
		int b = (i/100)%10 ;
		int c = (i/10)%10;
		int d = (i/1)%10;
		
		return a + b + c + d ;
	}
	
}
