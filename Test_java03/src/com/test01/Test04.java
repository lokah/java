package com.test01;

import java.util.Arrays;
import java.util.StringTokenizer;

import javax.xml.crypto.Data;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " 바나나 : 1000원, 사과 : 2000원, 배 : 3000원";
		System.out.println(str);
		String target = "사과";
		int target_num = str.indexOf(target);
		String result;
		result = str.substring(target_num, (str.substring(target_num).indexOf("원") + target_num));
		System.out.println(target_num);
		System.out.println(str.substring(target_num).indexOf("원") + target_num);
		System.out.println(result + "원");
		System.out.println(str.substring(target_num).indexOf("원"));
		
		StringTokenizer st = new StringTokenizer(str, ",|:");
		for (int i = 0; st.hasMoreTokens(); i++) {
			
		
			
			System.out.println(st.nextToken());
		}
		System.out.println();

		
		String [] st1 = str.split(",");
		for (int i = 0; i < st1.length; i++) {
			System.out.println(st1[i]);
		}
		
		
		
		
	}

}
