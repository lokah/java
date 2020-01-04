package com.test03;




public class Score {

	public static void main(String[] args) {
		// Score 클래스를 완성하자
		// getAvg 메서드는 국어 영어 수학 점수를 전달하면
		// 평균을 리턴해준다.
		// getGrade 메서드는 평균을 전달하면
		// 90~100 : A
		// 80~89 : B
		// 70~79 : c
		// 60~ 69 : d
		// 0~59 : f를 리턴해준다.

		// "***님의 평균은 xx.xx점이고, 등급은 '*'입니다."라고 출력

		Score sc = new Score() ; //논스태틱으므로 
		//그러면 스태틱일 경우는 ?
		
		double avg = sc.getAvg(100, 60,70);
		//System.out.println(avg);
		
		String grade = sc.getGrade(avg) ;
		System.out.printf("누구누구의 평균은 %.2f점이고," + "등급은 '%s' 입니다.", avg, grade);
		
	}

	
	
	public double getAvg(int kor, int eng, int math) {
		
		int sum = kor + eng + math ;
		double avg = (double) sum / 3 ;
		
		return avg ;
	}
	
	private String getGrade(double avg) {
		
		String res = null ;
		//스위치에는 실수가 들어갈 수가 없다.
		switch ((int) avg/10 ) {
		case 10 :
		case 9 :
			return "A" ;
		case 8 :
			return "B" ;
		case 7 :
			return "C" ;
		case 6 :
			return "D" ;
		default :
			return "F" ;
		}
		
	
		
		
		// return null ;//default 를 없애고 return 7;
	}

}
