package com_test04;

public class NTest {
	
	public static void main(String[] args) {
		int kor, eng, math; //변수를 선언한다
		kor = eng = math = 0; //이 줄은 지워도 같은 값이 출력되네/...?
		
		kor = 100;
		eng = 34;
		math = 79;
		
		int sum;
		double avg;
		
		sum = getSum(kor, eng, math);
		avg = getAvg(sum);
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : " + "%.2f \n", avg);
		
		
	}
	
	
	
// 1. 국어, 영어, 수학 점수를 받아서 총점을 리턴하는 메서드를 만들자
	//접근제한자는 default, 메모리영역은 static, 리턴타입은 int
	//파라미터는 int형 변수 세개, 이름은 getSum이다.
	
	
	static int getSum(int kor, int eng, int math) {
		int sum1 = kor + eng + math;
		return sum1;
		
	}
	//2. 총점을 받아서 평균을 리턴하는 메서드를 만들자.
	//접근제한자는 private, 메모리영역은 static, 리턴타입은 double
	//파라미터는 int형 변수 한개, 이름은 getAvg이다.
	
	private static double getAvg(int sum2) {
		double res = (double)sum2 / 3;
		return res;
		
	}
	
	
	//3. main 매서드에서 getSum과 getAvg를 호출하여,
	//총점과 평균을 출력하자.소수 둘째자리까지.
	// https://docs.oracle.com/javase/8/docs/api/index.html
	//소수 둘째자리는 위 사이트에서 먼저 패키지 java.lang에서 클래스는 String참조한다.
	
}
