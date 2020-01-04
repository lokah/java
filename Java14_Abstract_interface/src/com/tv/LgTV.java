package com.tv;

public class LgTV implements TV {

	private int volume ;
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		
		this.volume = volume;
	}
	
	@Override
	public int volumeUp() {
		
		volume += 3;
		
		return volume ;
	}

	@Override
	public int volumeDown() {
		volume -= 3;


		return 0;
	}

}
