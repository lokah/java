package com.test.array02;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				continue;
			}

				System.out.println(i+" ");
				sum+=i;

			}
System.out.println("홀수들의 합은 : " + sum);
		}
		

	}

