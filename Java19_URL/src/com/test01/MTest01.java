package com.test01;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class MTest01 {

	public static void main(String[] args) throws URISyntaxException {
		// TODO Auto-generated method stub

		
		URI u= new URI("http://localhost:8787/Java19_URL_Web/res.jsp?myname=%EA%B9%80%EC%9E%AC%EA%B2%BD&myaddr=%EC%84%9C%EC%9A%B8%EC%8B%9C+%EC%84%B1%EB%B6%81%EA%B5%AC+%EC%82%BC%EC%84%A0%EB%8F%99");
	
		
		System.out.println(u.getScheme());
		
		System.out.println(u.getHost());
		System.out.println(u.getPort());
		System.out.println(u.getPath());
		System.out.println(u.getQuery());//localhost 내컴퓨터의 나 127.0.0.1
		
	}

}
