package com.test01;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide() {

		System.out.print("계산결과는 ");

		try {
			System.out.print(this.left / this.right);
			System.out.println(" 입니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();

			System.out.println("오류가 발생했습니다." + e.getMessage());

		}

		// TODO Auto-generated catch block
		// e.printStackTrace();
		// System.out.println("오류가 발생했습니다..");
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();

		Calculator c2 = new Calculator();
		c2.setOprands(10, 5);
		c2.divide();
	}
}