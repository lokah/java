package com.test02;

class Subtractor {

	private int cntSub;
	
	
	Subtractor() { cntSub= 0 ;}
	int getCntSub() { return cntSub;}
	int subTwoNumber(int num1, int num2) {
		cntSub++;
		return num1-num2;
	}
	
}
