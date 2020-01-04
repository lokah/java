package com.test03;

public class Cal1 {

	int left, right;
	
	public Cal1() {
		
		
	}
	
	public Cal1(int left, int right) {
		
		this.left = left;
		this.right = right;
	}
	
	public void setCa(int left,int right) {
		
		this.left = left;
		this.right  = right;
	}
	
	
	
	public void sum() {
		
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		
		System.out.println((this.left + this.right)/2);
		
	}

	@Override
	public String toString() {
		return "left=" + left + ", right=" + right;
	}
	
	
}
