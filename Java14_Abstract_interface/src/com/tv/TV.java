package com.tv;

public interface TV {

	
	int volumeUp();
	int volumeDown();
	
	//tv를 상속받는 SamsungTV와 LgTV를 만들자
	//SamsungTV는 volumeUp/Down 시 크기가 +-2 씩
	//LgTV는 크기가 +-3씩
	//samsungTV와 LgTV에서 volume라는 field를 만들고
	//위의 기능을 하도록 코드를 작성하자
	//getter & setter도 생성
}
