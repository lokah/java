package com.bbb;

import com.aaa.AAA;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BBB b1 = new BBB() ;
		b1.setAbc(1);
		b1.setB(2);
		
		System.out.println(b1.getAbc() + "+" + b1.getB() + "=" + b1.getSum());
		
		BBB b2 = new BBB(3) ;
		
		System.out.println(b2.getAbc() + "+" + b2.getB()+ "="+ b2.getSum());
		
		BBB b3 = new BBB(4,5);
		System.out.println(b3.getAbc() + "+" + b3.getB() + "=" + b3.getSum());
		
		
		AAA a1 = new AAA() ;
		AAA a2 = new BBB() ;
		//BBB b4 = new AAA() ;자식으로 부모 를 받을 수 없다.
		
		a1.prn();
		a2.prn();
		//b4.getSum();
	}

}
