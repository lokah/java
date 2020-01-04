package com.test03;

import java.io.*;
import java.net.*;

//TCP
public class HiClient implements Runnable{
//Runnable 인터페이스는 구현할 메소드가 run() 하나 뿐인 함수형 인터페이스.
	
		// TODO Auto-generated method stub

		@Override //재정의
		public void run() {//When an object implementing interface Runnable is used to create a thread,
			try {
				//서버와 연결할 클라이언트 쪽 소켓을 만든다.
				Socket clientSocket;//러너블이 가진 추상 메소드
				//A socket is an endpoint(연결 부분의 종단점) for communication between two machines. 

				PrintWriter out = null;
				BufferedReader in = null;
				BufferedReader stdin = null;
				System.out.println("서버에 접송중입니다....");
				//클라이언트는 접속할 서버의 IP주소와 포트정보로 소켓을 생성해서 서버에 연결을 요청한다.
				//아이피 주소와 포트 번호를 새로운 소켓에 대입 저장 연결시킨다.
				clientSocket = new Socket("localhost", 9999);
				//서버 쪽에 보낼 스트림을 저장, 
				out = new PrintWriter(clientSocket.getOutputStream(),true);
				//true는 버퍼를 초기화시킨다. 자동적으로 보낸다.false 거나 없으면 전달이 안된다. 오토플러시라고 한다.
				//서버로부터 연결 요청 후 새로 받은 스트림을 버퍼단위로 저장
				in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				//콘솔 창에 입력하는 스트림을 받아서(InputStreamReader), 버퍼드(뭉텅이로)로 가져온 데이터를 한줄씩 읽어줘서(BufferedReader) 저장
				stdin = new BufferedReader(new InputStreamReader(System.in));
				
				String inputLine ;
				//콘솔창에 입력하면, 
				while((inputLine = stdin.readLine()) !=null) {
					//그 입력되는 스트림을 문자열로 저장해서 서버쪽으로 내보낸다.
					out.println(inputLine);
					//서버에서 다시 받은 스트림을 출력한다.
					System.out.println("server로부터 다시 받은 메시지 : " + in.readLine());
					
				}
				
				out.close();
				in.close();
				stdin.close();
				clientSocket.close();
				
				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}
		
		public static void main(String[] args) {
			//Runnable 형 인자를 받는 생성자를 통해 별도의 Thread 객체를 생성 후 start() 메소드를 호출해야 합니다.
			//동시에 여러 가지 작업을 처리할 때 필요
			// 쓰레드는 '동시에 실행되어야 하는' 개별적인 모듈을 의미하는 거에요. 쓰레드가 왜 필요한 지는 입출력의 측면에서 보시면 편합니다. 
			//우리는 흔히 C언어나 자바(Java) 프로그램을 작성할 때 사용자로부터 입력을 받는 부분을 넣을 때가 있습니다. 
			//다만, 이 때는 사용자가 입력할 때까지 어떠한 작업도 처리하지 못합니다.
			Thread client = new Thread(new HiClient());
			client.start();
		}

}
