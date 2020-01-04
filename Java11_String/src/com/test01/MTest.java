package com.test01;

public class MTest {

	static String str = "The String class represents character strings.";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello";

		System.out.println(1 + 2 + s);
		System.out.println(s);// 대입하기 전에는 변하지 않는다.

		s = s + 1 + 2;
		System.out.println(s);// String concatenation이라고 한다.

		// 1. str의 전체 길이(출력)
		// 2. str 전체 대문자로 바꿔서
		// 3. str 전체 소문자로 바꿔서
		// 4. str 첫번째로 나오는 c의 인덱스를
		// 5. "class"-"java"로 바꿔서
		// 6. "character"를 찾아서 대문자로 변환 후 변환된 내용으로 전체 출력
		// 7. str을 char[]로 출력하되 'c'만 출력하자
		// 8. str을 char[]로 출력하되 대문자만, 그리고 대문자의 갯수도
		// 9. str 모든 공백 제거 후 출력
		// 10. 전체 역순으로 출력.

		prn09();
		prn08();
		prn07();
		prn06();
		prn05();
		prn04();
		prn03();
		prn02();
		prn01();

	}

	private static void prn09() {

		char[] ch = str.toCharArray();
		int cnt = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] >=65 && ch[i] <=90) {
				System.out.println(ch[i]);
				cnt++;

			}
		}
		
		System.out.println("대문자의 갯수 : " + cnt);
	}

	private static void prn08() {

		char[] ch = str.toCharArray();
		System.out.println(ch);
		System.out.println(str);

	}

	private static void prn07() {

		char[] ch = str.toCharArray();
		int cnt = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'c' || ch[i] == 'C') {
				System.out.println(ch[i]);
				cnt++;
			}
		}

		System.out.println("\nc의 갯수 : " + cnt);
	}

	private static void prn06() {

		System.out.println(str.replace("class", "java"));

	}

	private static void prn05() {

		System.out.println(str.replace("class", "java"));

	}

	private static void prn04() {

		System.out.println(str.indexOf('c'));

	}

	private static void prn03() {

		System.out.println(str.toLowerCase());

	}

	private static void prn02() {

		System.out.println(str.toUpperCase());

	}

	private static void prn01() {

		System.out.println(str.length());
	}

}
