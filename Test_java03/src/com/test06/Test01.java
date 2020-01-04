package com.test06;


import com.test05.Child;
import com.test05.Parent;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		
		c.display();
		c.out();
		
		System.out.println();
		
		//Parent p = new Parent();
		Parent p = new Parent();
		Parent p1 = new Child();
		
		p.display();
		p1.display();
		
		
	}

}
