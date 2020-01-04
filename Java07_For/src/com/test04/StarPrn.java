package com.test04;

public class StarPrn {

	public void prn01() {
		// *
		// **
		// ***
		// ****
		// *****
		// i는 줄(0,1,2,3,4)
		// j는 *
		// (0+1),(1+1),(2+1)...
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void prn02() {
		// *****
		// ****
		// ***
		// **
		// * i는 줄(0,1,2,3,4)
		// j = (5-0,5-1,5-2...)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void prn03() {

		//     *
		//    **
		//   ***
		//  ****
		// *****

		for(int i =0; i<5; i++) {
			//공백 4(4-0),3(4-1),2,1,0
			//* 1(1+0),2(1+1),3,4,5
			for(int j=0 ; j<4-i;j++) {
				System.out.print(" ");
			}
			//*(1+0, 1+1, 1+2, 1+3,1+4)
			for(int k =0; k<i+1 ; k++) {
				System.out.print("*");
			}
			System.out.println() ;
		}
		
		
	}

	public void prn04() {
		//  *****
		//   ****
		//    ***
		//     **
		//      *

		for(int i =0 ; i<5; i++) {
			
			//공백이 먼저(0, 0+1,0+2,0+3,0+4)
			
			for(int j=0; j<0+ i ; j++) {
				
				System.out.print(" ") ;
			}
			//*은 5, 5-0,5-1,5-2,5-3
			for(int k= 0; k<5-i ; k++) {
				
				System.out.print("*") ;
			}
			
			System.out.println();
		}
		
		
	}

	public void prn05() {
		//    *
		//   ***
		//  *****
		// *******
		// *********
		
		for(int i =0; i<5;i++) {
			
			//공백(4-0,4-1,4-2,4-3,4-4)
			
			for(int j=0; j<4-i;j++) {
				System.out.print(" ") ;
			}
			
			//* 2*(0+1), 2*(1+1), 2*(2+1), 2*(3+1)..
			for(int k=0; k<2*i+1 ; k++) {
				System.out.print("*") ;
			}
			System.out.println();
		}
		
		
	}
	
	
}
