package com.test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Coll00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(3);
		A.add(3);
		
		Collection<Integer> B = new ArrayList<Integer>();
		B.add(3);
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		C.add(4);
		
		//System.out.println(A.containsAll(B));
		//System.out.println(A.containsAll(C));
		//A.addAll(B);
		A.retainAll(B);
		//A.removeAll(B);
		//System.out.println(A.addAll(B));
		
		
		Iterator hi = A.iterator();
		while(hi.hasNext()) {
			
			System.out.println(hi.next());
		}
		
	}

}
