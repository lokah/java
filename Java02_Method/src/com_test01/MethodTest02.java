package com_test01;

public class MethodTest02 {
	
	public static void main(String[] args) {
		
		//메모리 영역 : static / (non-static)
		//static : clss.method();
		
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();
		
		
		
		//(non-static)
		//class 변수 = new class();
		//변수.method();
		//MethodTest01.nonStaticMethod();
		MethodTest01 method01 = new MethodTest01();
		method01.nonStaticMethod();
	}

}
