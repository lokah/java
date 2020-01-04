package com.test06;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Card c1 = new Card() ;
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 8;
		System.out.println(c1.number+ " " + c1.kind + " " + c2.number+ " " + c2.kind);
		
		c1.width = 200;
		c2.width = 400;
		System.out.println(c1.width);
		System.out.println(c2.width + " "+ Card.width + " " + c1.width);
	}

}


class Card {
	
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	
	
	
}