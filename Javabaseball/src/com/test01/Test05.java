package com.test01;

public class Test05 {

	
	public void testString() {
		
		String str = "Hello Java";
		String concat, upperCase, replace, subString, subString1 ;
		char subString2;
		boolean subString3 ;
		
		System.out.println("기본 String : " + str);
		
		System.out.println("길이 : " + str.length());
		
		concat = str.concat(", Hi Java");
		upperCase = concat.toUpperCase();
		replace = upperCase.replace("J", "L");
		subString = replace.substring(3,10);
		subString1 = replace.substring(4);
		subString2 = replace.charAt(2);
		subString3 = replace.equals(subString1);
		
		System.out.println(concat); //Hello Java, Hi Java
		System.out.println(upperCase); //HELLO JAVA, HI JAVA
		System.out.println(replace); // HELLO LAVA, HI LAVA
		System.out.println(subString);//LLO LA
		System.out.println(subString1);//L
		System.out.println(subString2);//E
		System.out.println(subString3);//FALSE
		
		
	}
}
