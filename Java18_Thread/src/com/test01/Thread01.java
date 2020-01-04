package com.test01;


class MyThread implements Runnable {
	
	@Override
	public void run() {
		
		for(int i=0; i<10;i++) {
			
			System.out.println("i : " + i);
		}
	}
}

public class Thread01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("............");
		/*
		 * Thread 가 아니다.
		MyThread t01 = new MyThread();
		MyThread t02 = new MyThread();
		t01.run();
		t02.run();
		
		*/
		// Thread 가 맞다
		//멀티 트레드 란다.
		
		Thread t01 = new Thread(new MyThread());
		Thread t02 = new Thread(new MyThread());
		
		t01.start();
		t02.start();
		
		System.out.println("...............");
		
		
	}

}
