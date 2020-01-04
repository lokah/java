package com.test04;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {

				{ 100, 90, 80 }, 
				{ 30, 70, 90 }, 
				{ 60, 80, 40 }, 
				{ 70, 40, 100 } };

		
		int ktotal = 0,etotal = 0, mtotal = 0 ;
		
		int sumtotal = 0;
		
		System.out.println("번호   국어   영어   수학   총점   평균");
		System.out.println("========================");
		
		
		
		for (int i = 0; i < arr.length; i++) {
		
			
			
			int sum  = 0 ;
			double avg = 0;
			ktotal += arr[i][0];
			etotal += arr[i][1];
			mtotal += arr[i][2];
			
			System.out.print(i+1 + "  ");
			
			for (int j = 0; j < arr[i].length; j++) {
				
				sumtotal += arr[i][j];
				sum+= arr[i][j];
				avg = sum/(double)arr[i].length;
				System.out.printf("%4d",arr[i][j]);
				
				
			
				
			}
			System.out.printf("%4d %4.1f",sum, avg);
			System.out.println();
		}
		
			
		
		System.out.println("=========================");
		System.out.printf("총점 :%2d %2d %2d %2d",ktotal, etotal, mtotal, sumtotal);
		
	}

}
