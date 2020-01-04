package com.test09;

public class Test00 {
	
	
	
	public static void ex(Test01 t) {
		
		System.out.println("실행 결과");
		t.run();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test01 t0 = new Test02();
	
		Test01 t3 = new Test03();
		
		
		
		//Test02 t1 = new Test02();
		
		t0.setCal(10, 20);
		
		ex(t0);
		
	
		
		//Test03 t2 = new Test03();
		t3.setCal(20, 40);
		ex(t3);
		
	}

}
