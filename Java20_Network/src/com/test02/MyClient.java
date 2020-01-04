package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


public class MyClient {

	public static void main(String[] args) throws SocketException, IOException {
		// TODO Auto-generated method stub
System.out.println("클라이언트 입니다");
		//클라이언트 생성, 포트 번호가 없다.
		DatagramSocket ds = new DatagramSocket();
		//배열(하나의 묶음, 블록, 덩어리)
		byte[] buff = "연습입니다.".getBytes();
		//packet으로 감싸서 데이타를 보낸다. 아래의 주소로
		DatagramPacket sendPacket = new DatagramPacket(buff, buff.length,InetAddress.getByName("localhost"),8888);
		//데이터 보낸다.
		ds.send(sendPacket);
		
		ds.close();
		ds.disconnect();
		
	}

}
