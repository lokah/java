package com.test03;

public class TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 89;

		String grade ;

		if (score >= 90) {

			grade = "a";
			
			if(score>=98) {
				grade += "+";
			}else {
				
			grade += "-";
		}
		}else if(score>=80) {
			grade = "b";
			if(score>=88) {
				grade+= "+";
			}

		}else {
			grade = "f";
		}
		System.out.println("점수 :" + score +	 ", 학점 :" +grade);
	}
}
