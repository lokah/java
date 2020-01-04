package com.test01;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "abc abc온dA abcf담g";
		char[] c = null;
				c= str.toCharArray();
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace("a", "김"));
		System.out.println(str.substring(4));
		System.out.println(str.substring(4, str.length()));
		System.out.println(str.substring(3, 8));
		System.out.println(str.indexOf("온dA"));
		System.out.println(str.indexOf("abc"));
		System.out.println(str.lastIndexOf("abc"));
		System.out.println(str.substring(str.indexOf("온")));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(7));
		System.out.println(str.replace("온","김"));
		System.out.println(str.substring(str.indexOf("온"), str.indexOf("A")));
		System.out.println(str.toCharArray());
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(str.concat("김담담"));
		System.out.println(c);
		System.out.println(Arrays.toString(c));
		
		
	}

}
