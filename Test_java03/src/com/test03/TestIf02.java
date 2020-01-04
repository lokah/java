package com.test03;

public class TestIf02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 89;
		String grade;

		if (score >= 90) {
			grade = "a";

			if (score >= 98) {

				grade += "+";

			}

		} else if (score >= 80) {
			grade = "b";
			if (score >= 88) {
				grade += "+";
			}

		} else if (score >= 70) {

			grade = "c";
		}

		else {
			grade = "f";

		}

		System.out.println(grade);
	}
}