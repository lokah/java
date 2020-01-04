package com.test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coll02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> list1 = new ArrayList<Object>(10);
		
		list1.add(new Integer(5));
		list1.add(new String("java"));
		list1.add(new Integer(4));
		list1.add(new Integer(0));
		list1.add(new Integer(3));
		list1.add(new Integer(4));
		
		System.out.println(list1);
		ArrayList<Object> list2 = new ArrayList<Object>(list1.subList(1, 4));
		System.out.println(list2);
		
		print(list1,list2);
		
		Collections.sort((List<T>) list1);
		
	}

	 static void print(ArrayList<Object> list1, ArrayList<Object> list2) {
		// TODO Auto-generated method stub
		
		 
	}

}
