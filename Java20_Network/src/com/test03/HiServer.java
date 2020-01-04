package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HiServer {
	
//서버와 클라이언트간의 1:1 소켓 통신이다. 클라이언트 쪽에서 연결 요청이 있어야 서버가 응답한다.
//서버가 먼저 실행되어 클라이언트의 연결요청을 기다리고 있어야 한다.

//Socket : 프로세스간의 통신을 담당, InputStream과 OutputStream을 가지고 있다. 
	//이 두 스트림을 통해 프로세스간의 통신(입출력)이 이루어진다.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ServerSocket : 포트와 연결(bind)되어 외부 클라이언트의 연결요청을 기다리다 연결요청이 들어오면 
		//Socket을 생성해서 소켓과 소켓간의 통신이 이루어지도록 한다.


		ServerSocket serverSocket = null;
		Socket serviceSocket;
		PrintWriter out = null;
		BufferedReader in = null;
		
		try {
			//서버 소켓을 생성하고 포트 9999와 결합한다.
		serverSocket = new ServerSocket(9999);
		
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		while(true) {
			
			System.out.println("서버를 기다립니다....");
			
			try {
				//한 포트의 하나의 ServerSocket만 연결할 수 있다. (프로토콜이 다르면 같은 포트를 공유할 수 있다.)

				//1. 서버는 서버소켓을 사용해서 서버 컴퓨터의 특정 포트에서 클라이언트의 연결요청을 처리할 준비를 한다.



				//연결 요청을 받으면 서버소켓은 새로운 소켓 값을 생성해서 소켓(Socket setviceSocket)대입 저장한다.
				//서버소켓은 클라이언트의 요청을 받으면 서버에 새로운 소켓을 생성해서 클라이언트의 소켓과 연결되도록 한다.


			serviceSocket = serverSocket.accept();//accept는 new socket을 리턴
			
			System.out.println("cleint가 접속했습니다");
			//inputStreamReader 는 바이트로 넘어온 데이터를 문자로 바꿔주는 메소드
			in =new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
			//소켓을 통해 새로 스트림을 받는다.getInputStream, 읽어 들여서 InputStreamReader, 버퍼단위로 in변수에 대입 저장, BufferedReader.
			
			out = new PrintWriter(serviceSocket.getOutputStream(),true);
			//소켓 메소드의 getOutStream을 통해 내보낼 스트림으로 out 에 대입 저장한다.
			
			String inputLine; // 문자열을 하나 선언해서 그곳에 저장하고,
			
			
			while((inputLine = in.readLine()) !=null){//새로 받은 소켓의 스트림 문자열이 비어 있지 않다면, inputLine에 대입 저장해서 내보낸다.
				
				System.out.println("client 가 보낸 메시지 :" + inputLine);
				out.println("*" + inputLine); //별을 하나 첨가해 inpuLine에 저장한 스트림을 내보낸다.
				
		}
			
			out.close();
			in.close();
			serviceSocket.close();
			
			serverSocket.close();//서버소켓과 소켓을 모두 닫는다.
			
			}catch (IOException e) {
				e.printStackTrace();
			}
	}

	}
}
