package com.test03;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test03 t3 = new Test03("egoing");
		Test03 t2 = new Test03("egoing");
		Object t4 = new Test03("egoing");
		System.out.println(t3 == t2);
		System.out.println(t4.equals(t2));
		System.out.println(t3.toString());
		
	}

}
