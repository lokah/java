package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fi = new File("a.txt");
		try {
			myOutput(fi);
			myInput(fi);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// read
	private static void myInput(File fi) throws IOException {

		FileReader fr = new FileReader(fi);

		int ch;
		// -1은 파일의 끝을 의미한다. api에서 FileReader read 참조한다.
		while ((ch = fr.read()) != -1) {

			System.out.print((char) ch);
		}

		fr.close();

	}

	// write
	private static void myOutput(File fi) throws IOException {
		// throws 는 main(해당 메소드를 호출한)으로 예외를 대신 밀어준다.

		FileWriter fw = new FileWriter(fi, false);

		fw.write("연습중입니다. \n");
		fw.append("abc \n").append("def\n").append("ghi\n");
		// append는 부모의 메소드에서 가져온다.입력해주는데 입력해준 다음에 나온 애한테 또 입력해준다. 메소드를 연결해서 쓸 수 있다.
		fw.close();
	}

}
