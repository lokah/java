package com.test01;

public class NTest02 {

	public static void main(String[] args) {
		// java 1.7 이후부터는 문자열도 사용할 수 있다.
		// 이전 버젅에는 enum class 가 있었다.
		
		String s = "한국";

		switch (s) {

		case "한국":
			System.out.println("korea");
			break ;
		case "중국":
			System.out.println("china");
			break ;
		case "일본":
			System.out.println("japan");
			break;
		default:
			System.out.println("다른 나라 입니다.");

		}

	}

}
