package com.test04;

public class NTeset01 {

	// public static void prn01() {

	public static void prn02() {
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;

		}
		
		System.out.println("i : " +i);
	}

	public static void prn03() {
		
		do {
			System.out.println("hi");
		} while(false) ;
		}
	
	public static void prn04() {
		
		int i = 1;
		
		do {
			System.out.println(i) ;
			i++;
		} while (i < 10) ;
		System.out.println("I : " + i) ;
	}

		public static void prn05() {
			
			int i = 1 ;
			while(true) {
				System.out.println(i) ;
				i++;
				if(i==10) {
					break ;
				}
			}
			System.out.println("I : " + i) ;
		} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// prn01() ;
		prn02() ;
		prn03() ;
		prn04() ;
		prn05() ;

	}

}
