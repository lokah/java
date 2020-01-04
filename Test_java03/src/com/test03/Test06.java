package com.test03;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int value = 0, sum =0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("정수 숫자를 입력하세요(종료는 : 99) :");
			value = sc.nextInt();
			sum+=value;
			
			
		}while(sum <99) ;
		
		System.out.println("입력된 정수 값들의 합계 : " + sum);
		System.out.println();
	}

}
