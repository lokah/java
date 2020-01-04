package com.compare;

import java.util.Arrays;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score[] students = new Score[3];
		students[0] = new Score("홍길동", 80, 10, 97);

		students[1] = new Score();
		students[1].setName("이순신");
		students[1].setKor(17);
		students[1].setEng(91);
		students[1].setMath(65);

		Score hong = new Score("홍길자", 70, 91, 80);
		students[2] = hong;

		for (Score tmp : students) {

			System.out.println(tmp);
		}

		Arrays.sort(students);
		System.out.println("..............");
		for (Score tmp : students) {

			System.out.println(tmp);
		}

	}
}