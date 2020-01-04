package com.test01;

public class MethodTest01 {

	
	
	final int Apple_Price = 1000;
	int numOfApple = 20;
	int myMoney = 0;
	
	public int saleApple(int money) {
		
		int num = money/Apple_Price;
		numOfApple-=num;
		myMoney += money;
		return num ;
		
	}
	
	public void showSaleResult() {
		
		System.out.println("남은 사과 : "+ numOfApple);
		System.out.println("판매 수익 : " + myMoney);
		
	}
}
