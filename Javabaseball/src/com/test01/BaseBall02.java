package com.test01;



	
	import java.util.Scanner;

	public class BaseBall02 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int Com[] = new int[3]; // 컴퓨터가 던지 볼
			int User[] = new int[3]; // 사용자가 맞추기위해서 던지는 볼
			int num = 0; // 배열 인덱스를 위해서 사용하는 변수
			int count = 0; // 몇번에 맞추는지 세기 위해서
			boolean loop = true;
			
			int strike = 0; // Setting "Strike" Count = 0
			int ball = 0; // Setting "Ball" Count = 0
			
			
			// Process 1 : 배열의 길이 만큼 for문을 돌리면서 난수를 넣고, 중복된게 있는지 확인한다.
			for (int i = 0; i < Com.length; i++) {
				Com[i] = (int) (Math.random() * 9) + 1;
				for (int j = 0; j < i; j++) {
					if (Com[j] == Com[i]) {
						i--;
						break;
						}
					}
				}
			
			// Process 2 : User가 세 개의 정수를 입력하도록 하여, User 배열에 숫자를 넣도록 한다.
			Scanner sc = new Scanner(System.in);
			System.out.println("1∼9의 정수를 입력하세요  >>");
			
			
			// Process 3 : Computer의 배열과 User 배열을 서로 비교하여 Strike인지 Ball인지 구분하도록 한다.
			loop = true;
			while (loop) {			
				for (int i = 0; i < User.length; i++) {
					num = sc.nextInt();
					User[i] = num;
					if (num < 0 || num > 10) {
						System.out.println("1∼9의 정수를 입력하세요  >>");
						}
					}
							
				for (int i = 0; i < Com.length; i++) {
					for (int j = 0; j < User.length; j++) { // 배열의 값이 서로 동일해야 strike 처리가 됨.
						if (Com[i] == User[j] && i == j) {
							strike++;
							}
						else if (Com[i] == User[j] && i != j) {
							ball++;
							}
						}
					}
				
				System.out.println(strike + "스타라이크" + ball + "볼");
				strike = 0; // Setting "Strike" Count = 0
				ball = 0; // Setting "Ball" Count = 0
				
				if (strike >= 3) {
					loop = false;
					}
				count = count + 1;
				}
			
			System.out.println("횟수 : " + (count - 1));
			System.out.println("Game Over");
			sc.close(); // Scanner 종료
			}
		}

