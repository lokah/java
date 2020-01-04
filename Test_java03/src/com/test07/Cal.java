package com.test07;

public class Cal {

	int[] op ;
	
	public void setOp(int[] op) {
		
		this.op = op;
	}
	
	public void sum() {
		
		int total = 0;
		for(int value = 0 ; value<this.op.length;value++) {
			
		//System.out.println(this.op[value]);
			
			total += this.op[value];
		}
		System.out.println(total);
		
	}
	
	
	public void avg() {
		
		int total = 0;
		for(int value : this.op) {
			
			
			total+= value;
		}
		System.out.println(total/this.op.length);
	}
}
