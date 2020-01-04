package com.test01;

public class MTest01 {

	static String str = "The String class represents character strings.";
	static String str1 = "The String java represents character strings." ;
	static String str2 = "The String class represents CHARACTER strings." ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Hello";

		System.out.println(1+2+s);
		System.out.println(s);//대입하기 전에는 변하지 않는다.
		
		s =s+ 1+2;
		System.out.println(s);//String concatenation이라고 한다.
		
		System.out.println("....................");
				
		
		//1. str의 전체 길이(출력)
		//2. str  전체 대문자로 바꿔서
		//3. str 전체 소문자로 바꿔서
		//4. str  첫번째로 나오는  c의 인덱스를
		//5. "class"-"java"로 바꿔서
		//6. "character"를 찾아서 대문자로 변환 후 변환된 내용으로 전체 출력
		//7. str을 char[]로 출력하되 'c'만 출력하자
		//8. str을 char[]로 출력하괴 대문자만, 그리고 대문자의 갯수도
		//9. str 모든 공백 제거 후 출력
		//10. 전체 역순으로 출력.
		
		int i = str.length() ;
		System.out.println(i) ;
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.replace(str, str1));
		
		System.out.println(str.replace(str, str2));
		System.out.println(str.replace("class", "Java"));
		System.out.println(str.replace("character", "CHARACTER"));
		System.out.println("..................");
		System.out.println(str.
		
		
		
		char[] ch = new char[46];
		for (int j = 0; j < ch.length; j++) {
			ch[j] = (char) ('T' + j);
		}
		prn01(ch);

		
	}
	
	
	


public static void prn01(char[] arr) {

	for (int i = 1; i <= arr.length; i++) {

		System.out.print(Character.toUpperCase(arr[i - 1]) + " ");
		

}
	}
	
}

