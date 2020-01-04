package com.test07;

public class Test02 {

	
	int left;
	int right;
	int center;
	
	public void setCal(int left, int right ) {
		
		this.left = left;
		this.right = right;
		this.center = 0;
		System.out.println("2개");
	}
	
	public void setCal(int left, int right, int center) {
		
		
		this.left = left;
		this.right = right;
		this.center = center;
		System.out.println("3개");
		
		
	}
	
	public void sum() {
		
		System.out.println(this.left+ this.right+ this.center);
	}
	
	public void avg() {
		
		System.out.println((this.left+this.right+this.center)/3);
	}
}
