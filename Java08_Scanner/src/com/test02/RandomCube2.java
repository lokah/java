package com.test02;

import java.util.Random;

public class RandomCube2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		random01();
	}

	
	//1. 5*5 숫자를 출력하자(0~9 사이의 랜덤한 숫자 하나하나를)
		//2. 만들어진 전체 숫자의 평균을 출력하자
		
			
		

		public static void random01() {
			
			Random r = new Random();
			
			int sum = 0;
			for(int i=0 ; i<5 ; i++) {
				
				for(int j =0; j<5 ; j++) {
					System.out.printf("%d", r.nextInt(10));
					sum+=r.nextInt(10);
				}
				System.out.println() ;
			}
			System.out.println("평균 : " + ((double) sum/25));
		}
	}

