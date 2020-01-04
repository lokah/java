package com.test01;

import java.util.Scanner;

public class Test01 {

	
	public void input() {
		
		System.out.println("온이의 커피 머신입니다. 돈을 넣어주세요. 한 잔 당 300원입니다.");
		Scanner sc = new Scanner(System.in) ;
		
		
		
		int money = sc.nextInt();
		if(money%300 == 0) {
			
			System.out.println(money/300 + "잔이 나왔습니다. 안녕히 가세요");
		} else {
			
			System.out.println(money/300 + "잔이 나왔습니다. 잔돈은 " + money%300 + "원입니다. 또 오세요.");
		}
		
	}
}
