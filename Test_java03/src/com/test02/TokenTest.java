package com.test02;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "name, id, tel, pwd";
		
		StringTokenizer data = new StringTokenizer(str,",");
		
		for (int i = 0; data.hasMoreTokens(); i++) {
			
			
			System.out.println(data.nextToken());
		}
		
		
	}

}
