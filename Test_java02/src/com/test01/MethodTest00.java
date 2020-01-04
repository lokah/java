package com.test01;

public class MethodTest00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodTest01 seller = new MethodTest01() ;
		MethodTest02 buyer = new MethodTest02() ;
		
		int money = 3000;
		
		
		buyer.buyApple(seller, money);
		
		
		
		System.out.println("과일 판매자의 현재 상황");
		seller.showSaleResult();
		
		System.out.println("과일 구매자의 현재 상황");
		buyer.showBuyResult() ;
		
	}
	
	

}
