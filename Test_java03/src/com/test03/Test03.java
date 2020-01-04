package com.test03;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sc = 100;
		String gr;

		switch (sc / 10) {

		case 10:
			gr = "a+";
			//break;
		case 9:
			gr = "a";
			//break;

		case 8:
			gr = "b";
			break;
		case 7:
			gr = "c";
			break;
		default:
			gr = "f";

		}
		
		System.out.println(gr);

	}

}
