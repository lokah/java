package com.test01;

public class Refe {

	
	public static void runValue() {

		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue, " + a);

	}

	public static void run() {

		Fruit a = new Fruit(1);

		Fruit b = a;
		b.id = 2;
		System.out.println("run, " + a.id);

	}
	
	
}
