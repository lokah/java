package com.test03;


import java.util.*;

import com.score.Score;
//이거 안된다.

public class SetTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score sc01 = new Score("홍길동", 100, 45, 67);

		Score sc02 = new Score("이순신", 100, 45, 67);
		Score sc03 = new Score("김선달", 100, 45, 67);

		Set<Score> set = new HashSet<Score>();
		set.add(sc01);
		set.add(sc02);
		set.add(sc03);
		set.add(new Score("조세호", 100, 100, 46));

		//prn(set);
		transElement(set, "김선달",34);

	}

	private static void transElement(Set<Score> set, String name, int kor) {

		// iterator를 사용하여
		// set 안의 객체 중 이름이 "조세호"인 객체를 찾아서
		// 해당 객체의 국어점수를 파라미터 값으로 바꾸고
		// 전체 출력하자
/*
		Iterator<Score> ir = set.iterator();
		while (ir.hasNext()) {
			if (ir.next().getName().contentEquals(name)) {
				ir.next().setKor(kor);
			}
		}

	*/	
		
		Iterator<Score> ir = set.iterator();
		while (ir.hasNext()) {
			Score tmp = ir.next();
			
			if(tmp.getName().equals(name)) {
				tmp.setKor(kor);
				
				prn(set);
				
			}
		
		
		
		
		
	}
	}
	// 1
	private static void prn(Set<Score> set) {

		Object[] arr = set.toArray();
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
		}
		for (Object o : arr) {

			if (((Score) o).getName().equals("조세호")) {

				System.out.println(((Score) o).getName() + ":" + ((Score) o).getAvg());

			}

		}

		// 2

		Iterator<Score> ir = set.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
	// 3

	// Iterator -컬렉션 안에 저장되어 있는 요소를 읽어오는 표준화된 방법

}
