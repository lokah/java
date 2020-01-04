package com.test01;

public class SleepTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		while(true) {
			
			for(int i = 1; i<=10;i++) {
				
				
				try {
					Thread.sleep(500);//해당 초만큼 멈춰라
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.printf("%c", '*');
			}
			
			System.out.println();
		}
		
	}

}
