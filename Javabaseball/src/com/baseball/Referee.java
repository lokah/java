package com.baseball;

public class Referee {

	//ball에서 만든 목표 배열과
	//user에서 입력받은 배열을 비교
	//인풋 배열을 만들어서 
	//0번지는 스트라이크 갯수
	//1번지는 볼의 갯수
	//2번지는 아웃 갯수
	
	public int[] isStrike(int[] goal,int[] inputArr) {
		
		int[] output =new int[3];
		
	
		int strike = 0;
		int ball = 0;
		
		for(int i=0; i<goal.length; i++) {
			
			for(int j=0; j<inputArr.length;j++) {
				
				if(goal[i] ==inputArr[j]) {
					
					if(i==j) {
						
						strike++;
					}else {
						ball++;
					}
				}
			}
		}
		
		if(strike + ball ==0) {
			output[2] = 3;
		}else {
			
			output[0] = strike;
			output[1] = ball;
		}
		
		return output;
		
	}
	
	
	
}
