package com.test03;

public class Clone00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clone01 cl = new Clone01("ohndahm");
		try {
		Clone01 cl1 = (Clone01)cl.clone();
		System.out.println(cl.name);
		System.out.println(cl1.name);
		
	} catch (CloneNotSupportedException e){
		e.printStackTrace();
	}

}
}