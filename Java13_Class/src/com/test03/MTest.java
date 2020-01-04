package com.test03;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 메소드 이름이 같지만 다른 행위를 하고 있으므로 가능하다.
		//이것을 오버로딩이라고 한다.(다르지만 결국 더한다는 비슷한 행위가 하고 있을 때
		//파라미터의 타입이 같아야 한다.
		//같은 이름으로 다른 일을 하고 있지만 결국은 비슷한 일을 하고 있을 때 오버로딩
		MyCalc calc = new MyCalc();
		System.out.println(calc.sum(1, 2));
		System.out.println(calc.sum(3.45, 5.67));
		System.out.println(calc.sum(8, 9, 10));

	}

}
