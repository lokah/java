package com.test02;

public class Test04 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test04 t = new Test04();
		int i = 0;
		t.b();
		
	}

	
	public void a() {
		
		int j =0;
		for (int i = 0; i < 5; i++) {
			
			j+= i;
		}
		
		System.out.println(j);
	}
	
	
	public void b() {
		
		int j = 1;
		a();
	}
	
}
