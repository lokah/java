package com.test01;

public class MethodTest02 {

	
	int myMoney = 5000;
	int numOfApple = 0;
	
	public void buyApple(MethodTest01 seller, int money) {
		
		numOfApple+=seller.saleApple(money) ;
		myMoney-=money;
		
	}
	
	public void showBuyResult() {
		
		System.out.println("현재 잔액 : " + myMoney);
		System.out.println("사과 갯수 : " + numOfApple) ;
		
	}
	
	
}
