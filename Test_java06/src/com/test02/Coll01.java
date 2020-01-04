package com.test02;

import java.util.ArrayList;
import java.util.List;

public class Coll01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "대한. * 민국 대한 사람 그리고";
		
		String str1 = str.replaceAll(" .", "/");
		//str = str.replaceAll(".", "/");
		
		
		System.out.println(str1);
		System.out.println(str);
		
		int [] arr = {1,2,3,4,5};
		
		for (int i = 0; i < arr.length; i++) {
			int str2 = arr[i];
			System.out.printf("%d \n",str2);
		}
		
		List<Integer> arr1 = new ArrayList();
		
		for (int i = 0; i < 6; i++) {
			arr1.add(i);
			
			
			
		}
		System.out.println(arr1);
		arr1.replaceAll(x->x*5);
		System.out.println(arr1);
		
		int arr3 = arr1.lastIndexOf(20);
		int arr4 = arr1.set(4, 60);
		int arr5 = arr1.remove(5);
		arr1.add(3, 90);
		arr1.add(50);
		int arr2 = arr1.get(3);
		List<Integer> arr6 = arr1.subList(1, 4);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr4);
		System.out.println(arr1);
		System.out.println(arr5);
		System.out.println(arr6);
	}

}
