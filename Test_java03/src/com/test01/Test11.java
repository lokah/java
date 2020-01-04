package com.test01;

import com.test02.Child;
import com.test02.Parent;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
		Parent p1 = new Child();
		
		Child c = new Child();
		
		c.display();
		c.out();
		//p.display();
		
		
	}

}
