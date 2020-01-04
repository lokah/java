package com.test08;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] c = { 'a', 'v', 'e' };

		String a = "가위";
		Scanner sc = new Scanner(System.in);

		String d = sc.nextLine();

		if (a.equals(d)) {

			System.out.println("비겼다");
		} else if (!a.equals(d)) {

			if (d.equals("바위")) {

				System.out.println("이겼다");
			} else {
				System.out.println("졌다");

			}

		}
	}
}
