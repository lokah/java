package com.test03;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> set = new HashSet<String>();
		
		set.add("1");
		set.add("5");
		set.add("2");
		set.add("9");
		set.add("5");
		set.add("6");		
		set.add("3");
		set.add("8");
		
		System.out.println(set);
		
		setFind(set, "5");
		setDelete(set, "7");
	}
		
		public static void setDelete(Set<String>set, String del) {
			for(String d : set) {
				if(d.equals(del)){
					set.remove(del);
				
					System.out.println(d + "막았다");
					break;
				}
			
		}
		}
		public static void setFind(Set<String>set, String find) {
			
			for(String f : set) {
				if(f.equals(find)){
					System.out.println(f + "찾았다");
				}
			}
				
			
		}
	}
	
	
	
	


