package com.test04;

import java.util.ArrayList;

public class ArrayTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = new String[2];
		arr[0] = "one";
		arr[1] = "two";
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		ArrayList <String>arr1 = new ArrayList<String>();
		
		arr1.add("three");
		arr1.add("two");
		arr1.add("one");
		
		
		for (int i = 0; i < arr1.size(); i++) {
			
			String val = arr1.get(i);
			System.out.println(val);
		}
		
	}

}
