package com.test01;

public class Test02{
	
	public static void main(String[] args) {
     
        
        z(1, 0);
        
        
        
        
    
	}
    public static void z(int first, int second){
    	
    	int[] arr = new int[3];
        
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    	
        try {
			System.out.println(arr[first] / arr[second]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(10);
		} catch (ArithmeticException e) {
			System.out.println(20);
		} 
}
}
 

