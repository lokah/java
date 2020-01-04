package com.tv;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SamsungTV samsung = new SamsungTV();
		samsung.volumeUp();
		samsung.volumeDown();
		System.out.println(samsung.getVolume());
		
		LgTV lg = new LgTV();
		lg.volumeUp();
		lg.volumeUp();
		lg.volumeDown();
		System.out.println(lg.getVolume());
		
	}

}
