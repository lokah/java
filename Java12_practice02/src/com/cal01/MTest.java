package com.cal01;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//java.uill.calendar 클래스를 사용하지 않고 달력을 출력하자
		//hint : year년  month월->달력의  공백을 계산 year.month.1의 요일을 먼저 찾는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("연도 입력:");
		int year = sc.nextInt();
		System.out.println("월 입력 :");
		int month = sc.nextInt();
		
		DayOfCalendar.prn(year,month);
		
	}

}
