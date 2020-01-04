package com_test02;

import com_test01.MethodTest01;

public class MethodTest03 {
	
	

	public static void main(String[] args) {
		
		MethodTest01.publicMethod();
		//MethodTest01.protectedMethod();
		//MethodTest01.privateMethod();
		//MethodTest01.defaultMethd();
		
		MethodTest01 test = new MethodTest01();
		test.nonStaticMethod();
		
		//UML : United Modeling Language
		//https://www.objectaid.com/download 이곳에서 다운
		
		
	
	}

}
