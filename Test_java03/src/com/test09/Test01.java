package com.test09;

public abstract class Test01 {

	
	int left, right;
	
	public void setCal(int left, int right) {
		
		this.left = left;
		this.right = right;
	}
	
	int _sum() {
		
		return this.left + this.right;
	}
	
	public abstract void sum();
	public abstract void avg();
	
	public void run() {
		
		sum();
		avg();
	}
}
