package com.test01;

public class Sbuffer {

	
	public void tBuffer() {
		
		StringBuffer str1 = new StringBuffer() ;
		StringBuffer str2 = new StringBuffer("20") ;
		StringBuffer str3 = new StringBuffer("java") ;
		
		
		
		str1.append("Hi");
		
		str2.append(" Hello");
		
		str3.insert(4, " " + str2+"! ");
		
		System.out.println(str2);
		System.out.println(str3);
	}
}
