package com.cal02;

import java.util.Calendar;

public class CalendarUseApi {

	public void prn(int year, int month) {

		Calendar cal = Calendar.getInstance();// 현제 날짜와 시간을 세팅
		// singleton pattern : 메모리에게 객체가 단 한번만 만들어지고
		// 이후에 다시 호출하면 메모리에 있는 객체가 전달된다.
		// get(), set()
		// 객체 지향 프로그래밍에서는 메소드를 통해서 데이터를 변경하는 방법을 선호한다.
		// setter는 값을 저장(셋팅)하게 유도하는 메소드이다.
		// 반대로 getter는 값을 return받게 해주는 메소드이다.
		// Set 메소드는 데이터의 값을 집어넣을때 사용합니다
		// get 메소드는 데이터의 값을 가져올때 사용합니다.

		System.out.printf("\t\t%d년 %d월 \n", year, month);
		System.out.printf("일 \t월 \t화 \t수 \t목 \t금 \t토n");
		// 우선 Calendar cal = Calendar.getInstance(); 를 사용해 현재 날짜를 cal 객체에 저장한다

		// 이후 cal.set을 통해 년월일을 설정하는데

		// 위처럼 년월일 따로 설정하거나

		// 혹은 set(년,월,일) 으로 한번에 설정하는 것이 가능하다

		// 월에 -1을 해 주는 이유는 자바에서 1월은 0이기 때문이다
		// 시작 날짜를 설정
		cal.set(year, month - 1, 1);
		// 1 ~ 7 요일의 첫번째 시작일을 설정한다.
		// 또한 요일을 가져오는 경우에는 숫자로 가져오게 되는데

		// 일요일부터 시작해 토요일로 끝난다

		// 일요일은 1 토요일은 7이다
		// 그 주일의 마지막 일을 Calendar에서 제공하는 get 함수를 통해 얻으면 됩니다.
		//실제 설정된 달의 요일을 가져온다.
		int start = cal.get(Calendar.DAY_OF_WEEK);
		//요일만큼 공백
		for (int i = 1; i < start; i++) {
			System.out.print("\t");
		}
		// getActualMaximum() 메소드는 [날짜가 셋팅된 현재 설정에서 가질 수 있는 의 최대값(특정 달의 최대 날짜)]을 리턴한다.

		//달력 출력
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%d\t", i);
			if (start % 7 == 0) {
				System.out.println();
			}
			start++;
		}

	}
}
