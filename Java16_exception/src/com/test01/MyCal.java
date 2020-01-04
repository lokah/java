package com.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCal {

	
	
	public int inputNum() {
		
		int n = 0;
		
		
		System.out.println("숫자만 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		return n;
		
				
	}

	
	public int calculation() {
		
		int res = 0;
		
		while(true) {
			
			try {
			res  = inputNum()/inputNum();
			
			String a = "10";
			int i = Integer.parseInt(a);
			System.out.println(res);
			break ;
			}catch(InputMismatchException e) {
				//e.printStackTrace();
				System.out.println("숫자 입력 하세요");
				
			}catch(NumberFormatException e) {
				System.out.println("숫자 변환 에러");
			
			e.printStackTrace();
		}finally {
			System.out.println("...............");
		
		
		
		
	}
		
		
			
}
		return res;
		
	}
	
	
	}
