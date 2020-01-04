package com.test07;

 class Test11 {

	private int left, right ;
	
	public void setOp(int left, int right) {
		
		this.left= left;
		this.right = right;
		
	}
	
	
	private int sumS() {
		
		return this.left + this.right;
		
	}
	
	public void sumDe() {
		
		System.out.println("++++"+ (this.left + this.right));
		
	}
	
	public void sumDs() {
		
		System.out.println("----------"+ sumS());
	}
	
}
