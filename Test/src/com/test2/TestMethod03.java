package com.test2;

public class TestMethod03 {
	
	public static void main(String[] args) {
		
		divide(15, 5);
		divide(35, 5);
		divide(75,6);
		
		
	}

	
	public static void divide(int n01, int n02) {
		
		int sum = n01/n02;
		if(n01%n02 !=0) {
			System.out.println("나머지를 구할 수 없다");
			return;
		}
		
		
		System.out.println(sum);
			
		}
	}

