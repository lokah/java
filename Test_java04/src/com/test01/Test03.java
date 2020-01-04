package com.test01;

import java.util.Scanner;

public class Test03 {

	
	public void input() {
		System.out.println("안녕하세요, 온이네 빙수 가게입니다. 빙수 한 그릇은 1000원입니다. 돈을 넣어주세요");
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		
		
		if(money>=1000) {
			System.out.println("빙수 몇 그릇이 필요하십니까 ? 원하는 그릇수를 눌러주세요");
			Scanner sc1 = new Scanner(System.in);
			int count = sc1.nextInt();
			
			make(money, count);
		}else {
			
			System.out.println("죄송합니다. 금액이 부족합니다.");
			System.out.println("잔돈은 " +  money%1000 +"원입니다. 다시 넣어주세요");
		}
		
		
	}
	
	
	public void make(int money, int count) {
		
		int coffee = money -(count*1000);
		
		if(coffee>=0) {
		System.out.println(count + " 그릇을 원하셨습니다. 잠시만 기다려주세요");
		System.out.println(count + "잔이 나왔습니다. 잔돈은" + coffee + "원입니다. 감사합니다. 또오세요 !");
		
		}else {
			
			System.out.println("당신 바보야, 넣은 돈보다 원하는 그릇이 더 많잖아. 다시 눌럿 !");
			
		}
		
		
	}
}
