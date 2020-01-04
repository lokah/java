package com.test;

public class Test02 {
	
	public static void main(String[] args) {
		
	int a = 3;	
    double num = 7.1;
	System.out.println("a" + " " + num);	
	
	int num1 = 10;
	int num2 = 20;
	int sum = num1 + num2;
	int num4;
	num4 = 40;
	
	short num5 = 2;
	short num6 = 3;
	short num7 = (short) (num5 + num6);
	
	long num8 = 20;
	long num9 = 30;
	long num10 = num8 + num9;
	
	char tex = '오';
	String lit = "안녕";
	boolean tf = true;
	
	double d01, d02, dsum;
	d01 = 1.0000001;
	d02 = 2.0000001;
	dsum = d01 + d02;
	
	double e1 = 1.2e+3;
	double e2 = 4.5e-2;
	double e3 = 1.2e+3;
	double e4 = 2e-3;
	
	int n01 = 3;
	int n02 = 777777777;
	int n03 = 6;
	System.out.println(num1 + "+" + num2 + "=" + sum + "-");
	System.out.println(num7);
	System.out.println(num10);
	System.out.println(tex);
	System.out.println(lit + " My Ohn");
	System.out.println(tf);
	System.out.println(dsum);
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(n01);
	System.out.println(n02);
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Short.MIN_VALUE + "~" + Short.MAX_VALUE);
	System.out.println(e3);
	System.out.println(e4);
	System.out.println(3 > 2);
	System.out.println(3 < 2);
	System.out.println(n03 < 3);
	System.out.println(289.7 + 3.9766);
		
	}
	
	

}
