package com.test07;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cal c = new Cal() ;
		
		int[] op = new int[]{10,20};
		
		c.setOp(op);
		//c.setOp(new int[] {10,20});
		c.sum();
		c.avg();
		
		c.setOp(new int[] {10,20,30});
		c.sum();
		c.avg();
	}

}
