package com.test01;

import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector<String> v = new Vector<String> () ;
		v.add("홍길동");
		v.add("이순신");
		v.add("강호동");
		v.add("유재석");
		v.add("신동엽");
		v.add("조세호");
		
		prn(v) ;
		
		
		//System.out.println(v);
		
		
		transElement(v);
	}
	
	public static void transElement(Vector<String>v) {
		
		//1.홍길동의 인덱스를 찾아서 해당 인덱스에 있는 값을 홍길순으로 바꾸자
		
		//3. 호로 끝나는 객체를 찾아서 만일 없다면 삭제하자.
		v.set(v.indexOf("홍길동"), "홍길순");
		v.indexOf("홍길동");
		
		prn(v);
		
		
		
		//2.신으로 끝나는 객체를 찾아서 만일 있다면 신을 자로 바꾸자
		for(int i = 0; i<v.size(); i++) {
			
			if(v.get(i).startsWith("신")) {
				//v.set(v.indexOf(v.get(i)), "이순자");
				v.set(i, v.get(i).replace("신", "자"));
			//System.out.printf(v.get(i) + " ");
			//if(v.get(i)=="신") {
				
				//System.out.printf(v.get(i).replace("자", null));
			}
		}
		prn(v);
		
		/*for(String s : v) {
			
			if(s=="홍길동") {
				System.out.printf(s.replace("홍길동", "홍길순"));
				
				
			}
			if(s=="신") {
				
			}
			
		}
		*/
		
		/*for(String s:v) {
			if(s.endsWith("호")) {
				
				v.remove(s);
				break;//이것이 없으면 에러가 난다
			}
		}*/
		
		for(int i = 0;i<v.size();i++) {
			
			if(v.get(i).endsWith("호")){
				
				v.remove(i) ;
			}
		}
		
		prn(v);
	}
	
	public static void prn(Vector<String> v) {
		
		//향상된 for문 또는 forEach
		//s는 그룹의 값을 하나하나 받을 변수, v는 그룹 (collection)혹은 배열의 값
		for(String s : v) {
			System.out.printf("%s\t", s);
		}
		System.out.println();
	}

}
