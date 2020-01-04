package com.cal;

public class LeapYear2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	boolean leap = isLeapYear(2008) ;
	System.out.println(leap);
}

public static boolean isLeapYear(int year) {
	

	boolean leap;
	if (year % 4 == 0) {
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				leap = true;
			} else {
				leap = false;
			}
		} else {
			leap = true;
		}

	} else {
		leap = false;
	}

	return leap;

}

}
