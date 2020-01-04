package com.test01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Coll01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> a =  new HashMap<String, Integer>();
		a.put("two", 2);
		
		a.put("three", 3);
		a.put("one", 1);
		a.put("seven", 7);
		
		
		
		
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		
		
		System.out.println(a.get("three"));
		iteratorUsingForEch(a);
		iteratorUsingIterator(a);
		
	}

	
		 
		
		
	

	static void iteratorUsingForEch(HashMap map) {
		 
		 Set<Map.Entry<String, Integer>> entries = map.entrySet();
		 
		 Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		 while(i.hasNext()) {
			 
			 Map.Entry<String, Integer> entry = i.next();
			 System.out.println(entry.getKey() + ":" + entry.getValue());
		 }
		 
		
	}
	
	 static void iteratorUsingIterator(HashMap map) {
		 
		 Set<Map.Entry<String, Integer>> entries = map.entrySet();
		 Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		 while(i.hasNext()) {
			 
			 Map.Entry<String, Integer> entry = i.next();
			 System.out.println(entry.getKey() + " : " + entry.getValue());
		 }
	
	

}
}
