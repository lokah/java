package com.test02;

import java.util.Scanner;

public class Test03 {

	
		// TODO Auto-generated method stub

		
		public static void main(String[] args) {
	        
	        /*
	         * 컴퓨터와 가위,바위,보 게임을 해서 몇번을 이기는지 승률 알아보기. 
	         * 가위[1] 바위[2] 보[3]
	         */
	        
	        //입력 메서드 객체화
	        Scanner sc = new Scanner(System.in);
	        
	        //컴퓨터와 유저가 무었을 내었는지 확인
	        String comStr="",userStr="";
	        
	        //결과
	        int win=0,lose=0,draw=0,fail=0;
	        
	        //Start
	        System.out.println("코인을 집어 넣으세요(최대 10)");
	        
	        //게임 횟수
	        int coin = sc.nextInt();
	        
	        //10이상일 경우 프로그램 종료
	        if(coin > 10) {
	            System.out.println("10회 이상 사용할 수 없습니다.");
	            return;
	        }
	        
	        //게임 시작
	        System.out.println("===============GAME START================");
	        System.out.println("어떤걸 내시겠습니까? 가위[1] 바위[2] 보[3]");
	        for(int i = 0;i < coin;i++) {
	            //1~3의 랜덤 숫자
	            int computer =(int)(Math.random()*3)+1;
	            //사용자 입력값
	            int user = sc.nextInt();
	            //컴퓨터 값
	            if(computer == 1) {
	                comStr="가위";
	            }else if(computer == 2) {
	                comStr="바위";
	            }else if(computer == 3) {
	                comStr="보";
	            }else {
	                comStr="시스템 오류";
	            }
	            //유저의 값
	            if(user == 1) {
	                userStr="가위";
	            }else if(user == 2) {
	                userStr="바위";
	            }else if(user == 3) {
	                userStr="보";
	            }else {
	                userStr="손가락 오류";
	            }
	            System.out.println("[유저] "+userStr+"  =VS= "+comStr+" [컴퓨터]");
	            if(user >= 1 && user <= 3) {
	                if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {
	                    win++;
	                    System.out.println("[승리]");
	                }else if(computer == user) {
	                    lose++;
	                    System.out.println("[무승부]");
	                }else {
	                    draw++;
	                    System.out.println("[패배]");
	                }
	            }else {
	                fail++;
	                System.out.println("값을 잘못 입력 하였습니다.");    
	            }
	            System.out.println("=========================================");
	        }
	        // 승리 / (총 경기) x 100
	        float odds = ((float)win/(float)(coin))*100;
	        
	        System.out.println("[결과] 게임 횟수 : " +coin);
	        System.out.println("[전적] win:"+win+"번, lose:"+lose+"번, draw:"+draw+"번, 무효:"+fail+"번");
	        System.out.printf("[승률] %.2f%% \n",odds);
	        System.out.println("================GAME END=================");
	        sc.close();
	    }
	}
		
		
	


