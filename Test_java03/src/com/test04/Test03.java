package com.test04;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("당신의 주민번호를 입력해주세요. 예) 661105-1xxxxxx");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char num = str.charAt(7);
		
		switch(num) {
		
		
		case '1' : case '2' :
			
			switch(num) {
			
			case '1' :
				System.out.println("당신은 2000년 이전에 태어난 남자입니다.");
				break;
			case '2' :
				System.out.println("당신은 2000년 이전에 태어난 여자입니다.");
				
			}
			
			break;
			
		case '3' : case '4':
			switch(num) {
			
			case '3': 
				System.out.println("당신은 2000년 이후에 태어난 남자입니다.");
				
				break;
			case '4' :
				System.out.println("당신은 2000년 이후에 태어난 여자입니다.");
		
			}
			break;
		}
		
	}

}
