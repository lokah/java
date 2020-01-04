package com.test02;

class A {
	
	public int id;
	
	A(int id) {
		
		this.id = id;
	}
}

 
 public class Refer {
	 
	
	 
	 public static void runvalue() {
		 
		 int a= 1;
		 int b = a;
		 b = 2;
		 System.out.println("runalue, " + a);
	 }
	 
	 public static void run() {
		 
		A a =new A(1);
		A b  = a;
		b = new A(4);
		b.id = 3;
		System.out.println("run , " + b.id);
	 }
	 
	 public static void main(String[] args) {
		 
		 runvalue();
		 run();
	 }
 }
