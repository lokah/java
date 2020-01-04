package com.test02;



class MyCal extends Thread{
	
	private int start;
	private int stop;
	int sum;
	
	public MyCal(int start, int stop) {
		
		this.start = start;
		this.stop = stop;
		
	}
	
	@Override
	public void run() {
		
		sum = 0;
		
		for(int i = start;i<=stop;i++) {
			
			sum+= i;
			System.out.println("Current Thread :" + currentThread().getName());
		}
	}
}




public class JoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCal t01 = new MyCal(1,5);
		MyCal t02 = new MyCal(6,10);
		t01.start();
		t02.start();
		
		
		
		try {
			t01.join();
			t02.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread1 sum :" + t01.sum);
		System.out.println("Thread2 sum :" + t02.sum);
		
		System.out.println("Total sum :" + (t01.sum+t02.sum));
		
		
		
		
	}

}
