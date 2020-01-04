package com.test01;

public class MTtest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[] d = {'a', 'b', 'c', 'd', 'e', 'f','g', 'h', 'i', 'j', 'k', 'l',
				'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
	
		
		test(d);
		test02(d) ;
		test03(d) ;
	}

public static void test(char[] arr) {
	
	
	
	for (int i = 0; i < arr.length; i++) {

		
			System.out.print(arr[i]+"  ");

}
	System.out.println();
}

public static void test02(char[] arr) {
	
	
	
	for (int i = 25; i >=0 ; i--) {

		
			System.out.print(arr[i]+"  ");

}
	
	System.out.println();
	
}

public static void test03(char[] arr) {
	arr[0]= 'A';
	
	for (int i = 0; i < arr.length; i++) {

		
		System.out.print(arr[i]+"  ");
}

}
}
