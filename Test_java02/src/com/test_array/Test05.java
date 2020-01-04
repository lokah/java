package com.test_array;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[] ca = new char [] {'a','b','d','w'};
		
		char[] ch = {'1','4','6','9','8'};
		
		char[] res = new char[ca.length+ch.length];
		
		
		System.arraycopy(ca,0,res,0,ca.length);
		System.arraycopy(ch, 0, res, ca.length, ch.length);
		System.out.println(res);
		System.arraycopy(ca, 0, ch, 0, ca.length);
		System.out.println(ch);
	}

}
