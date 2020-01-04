package com.test02;

public class Gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gugu01() ;
		gugu02() ;
		gugu03() ;
	}

	public static void gugu01() {
		//2단 ~ 9단까지 전체 출력 (for)
		for(int j = 2 ; j<10 ; j++) {
			//System.out.println("<" + j+ "단>");
			for(int i = 1 ; i<10 ; i++) {
				System.out.println(j + " * " + i + " = " + j*i);
				//System.out.println("%d * %d = %d \n", j,i,j*i);
			}
			//System.out.println() ;
		}System.out.println("...............");
	}
	
	
	
	public static void gugu02() {
		//i단만 출력 (for)
	
		for(int i = 1; i <10 ; i++) {
			
			System.out.println(i);
		}
		System.out.println("...............");
	}
	//public static void gugu02(int i) {
	//System.out.println("<"+ i + "단>") ;
	//for(int j = 1 ; j<10 ; j++) {
	//System.out.println(i + "*" + j + "="+(i*j));}
	//}
	
	
	public static void gugu03() {
		
		//2단 ~9단까지 전체 출력(while)
		//int i = 2;
	
		//while(i<10) {
		//System.out.println(i+"단") ;
		//int j = 1;
		//while(j<10) {
		//System.out.println("%d * %d = %d \n", i,j,i*j);
		//j++;}
	//}
		//i++;
		// System.out.println();}
	//}
		int j = 2 ;
		while(j<10) {
			int i = 1;
			while(i<10) {
				System.out.println(j + " * " + i + " = " + j*i);
				
				i++ ;
					
			}
			j++ ;
			
		}
	}
}
