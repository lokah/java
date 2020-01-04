package com.test03;

import java.util.StringTokenizer;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "자바: 수학: 미학: 시련:";
		
		StringTokenizer st = new StringTokenizer(str,"") ;
		
		
		
		
		int num = 10;
		if(num>0) {
			while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
			}
			System.out.println("num은 양수이다");
		}
		
		System.out.println(str);
		
	}

}
