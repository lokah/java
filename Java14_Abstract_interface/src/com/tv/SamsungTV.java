package com.tv;

public class SamsungTV implements TV {

	private int volume ;
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		
		this.volume = volume;
	}
	
	@Override
	public int volumeUp() {
		
		//볼륨을 올려주고 +2
		volume  += 2;
		return volume;
	}

	@Override
	public int volumeDown() {
		
		//볼륨을 내려주고 -3
		volume -= 2 ;
		return volume;
	}

}
