package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//UDP
public class MyServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//DatagramSocket은 This class represents a socket for sending and receiving datagram packets.

		System.out.println("서버입니다.");
		//8888 포트를 가지고 서버 생성해주는 메소드
		DatagramSocket ds = new DatagramSocket(8888);
		//수신되는 스트림, 1024의 길이를 가진 값을 저장할 배열
		byte[] buff = new byte[1024];
		//This class represents a datagram packet. 

		//packet을 만들어서 저장할 공간을 준비한다.
		DatagramPacket recievePacket = new DatagramPacket(buff,buff.length);
		//데이터를 받는다.
		ds.receive(recievePacket);
		//바이트 배열로 되어 있었기 때문에 String으로 받는다.
		System.out.println(new String(recievePacket.getData()));
		
		ds.close();
		ds.disconnect();
		
		
	}

}
