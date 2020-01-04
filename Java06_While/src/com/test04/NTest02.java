package com.test04;

public class NTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. 1~100 까지의 숫자를 역순으로 출력하자
		//2. 1~100 까지의 숫자 중 2의 배수만 출력하자
		//3. 1~100 까지의 숫자 중 7의 배수의 갯수와 총합을 출력하자.
		//먼저 갯수와 총합의 변수를 만들자
		
		//test01() ;
		test02() ;
		test03() ;
	}

	
	//public static void test01() {
		
		//int i = 100;
		//while(i<101) {//i>0으로 해도 된다.
			//System.out.println(i) ;
			//i--;
			//if(i==0) {
				//break ;
			//}
		//}
		
	//}
	
	public static void test02() {
		int i = 1 ;
		while(i<=100) {
			
			
		
			if(i%2==0 ) {
				System.out.println(i) ;
			
			}
			i++;
		}
		
	}	
	
	
	private static void test03() {
		int i = 1;
		int count = 0;
		int sum = 0;
		
		while(i<=100) {
			
			count = i/7 ;
			if(i%7==0) {
			//count ++ ;// 이렇게 해도 된단다.
				sum+= i;
				}
			
			i++ ;
		}
		System.out.println("2의 배수의 갯수는 : " + count + ", 2의 배수의 총합은 : " + sum);
		
	}
			
		}
		
	

