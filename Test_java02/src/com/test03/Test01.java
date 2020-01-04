package com.test03;

public class Test01 {

	String Name;
	  int Kor;
	 int Eng;
	 int Math;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getKor() {
		return Kor;
	}

	public void setKor(int kor) {
		Kor = kor;
	}

	public int getEng() {
		return Eng;
	}

	public void setEng(int eng) {
		Eng = eng;
	}

	public int getMath() {
		return Math;
	}

	public void setMath(int math) {
		Math = math;
	}

	public Test01(String name, int kor, int eng, int math) {
		super();
		Name = name;
		Kor = kor;
		Eng = eng;
		Math = math;
	}

	
}
