package com.test01;

public class CTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FruitSeller seller = new FruitSeller() ;
		seller.initMembers(0, 30, 1500);
		FruitSeller seller2 = new FruitSeller() ;
		seller.initMembers(0, 20, 1000);
		
		FruitBuyer buyer = new FruitBuyer() ;
		buyer.buyApple(seller,4500);
		buyer.buyApple(seller2,2000);
		
	}
	
	

}
