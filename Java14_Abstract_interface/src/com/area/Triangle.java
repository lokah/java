package com.area;

import java.util.Scanner;

public class Triangle extends AreaImpl {

	public Triangle () {
		
		
	}
	
	
	
	@Override
	public void make() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변을 입력해 주세요");
		int x = sc.nextInt();
		System.out.println("높이를 입력해 주세요.");
		int y = sc.nextInt();
		
		double res = x * y /2.0;
		
		setResult(res + "");
				
	}
	@Override
	public void print() {
		
		System.out.print("삼각형의 ");
		super.print();
	}
	
}
