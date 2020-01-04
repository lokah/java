package com.test04;

import java.util.Scanner;

public class TestStar01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 1;
		if (k <= 4) {
			for (int i = 1; i < k; i++) {

				System.out.println(" ");
			}
		} else if(k ==5 ) {

			for (int j = 1; j < k; j++) {
				System.out.println('*');
				break;
			}
		} else {
			
			k++;
			
		}

	}

}
