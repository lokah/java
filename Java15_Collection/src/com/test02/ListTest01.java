package com.test02;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();

		list.add("홍길동");
		list.add("이순신");
		list.add("강호동");
		list.add("유재석");
		list.add("신동엽");
		list.add("조세호");

		// prn(list);
		// System.out.println(list) ;
		// prn02(list);
		// prn03(list);
		transElement(list);
	}

	private static void transElement(List<String> list) {
		// 1. 홍길동을 김길동으로 바꾸자

		list.set(list.indexOf("홍길동"), "김길동");
		list.indexOf("홍길동"); //이것은 없어도 된다.

		for (String s : list) {
			// System.out.printf("%s\t", s);
			System.out.print(s + "\t");
		}
		System.out.println();
		// 2. 신 으로 끝나는 객체를 찾아서 만일 있다면 신을 자로 바꾸자

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).endsWith("신")) {
				// v.set(v.indexOf(v.get(i)), "이순자");
				list.set(i, list.get(i).replace("신", "자"));
				// System.out.printf(v.get(i) + " ");
				// if(v.get(i)=="신") {

				// System.out.printf(v.get(i).replace("자", null));
			}
		}

		for (String s : list) {
			// System.out.printf("%s\t", s);
			System.out.print(s + "\t");
		}
		System.out.println();

		// 3. 호로 끝나는 객체를 찾아서 만일 있다면 삭제하자

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).endsWith("호")) {

				list.remove(i);
			}
		}

		for (String s : list) {
			// System.out.printf("%s\t", s);
			System.out.print(s + "\t");
		}
		System.out.println();
		
		
	}

	public static void prn(List<String> list) {

		for (String s : list) {
			// System.out.printf("%s\t", s);
			System.out.print(s + "\t");
		}
		System.out.println();
	}

	public static void prn02(List<String> list) {
		System.out.print("{");
		for (int i = 0; i < list.size(); i++) {
			if (i < list.size() - 1) {
				System.out.print(list.get(i) + ",");
			}

			else {
				System.out.println("}");
			}

		}
	}

	public static void prn03(List<String> list) {

		for (int i = 0; i < list.size(); i++) {
			// System.out.printf("%s\t", s);
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
	}
}
