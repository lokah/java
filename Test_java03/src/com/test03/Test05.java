package com.test03;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int value = 0, sum =0;
		
		String str = "beatles";
		String str1 = "pink floyd";
		StringTokenizer st = new StringTokenizer(str, "e");
		
		String[] str2 = str1.split(" ");
		
		do {
		
		System.out.println(st.nextToken());
		
		for (int i = 0; i < str2.length; i++) {
			
			System.out.println(str2[i]);
		}
		
		
	}while(st.hasMoreTokens());

}
}