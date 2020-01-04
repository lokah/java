package com.test01;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AA a = new AA();
		Super s = a;
		
		//BB b = (BB)s ;//AA와 BB는 다름으로 형변환할 수 없다.
		
		System.out.println(a.hashCode());
		System.out.println(s.hashCode());
		
	}

}
