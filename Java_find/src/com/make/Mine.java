package com.make;

public class Mine {

	private int size ;
	private String[][] arr;
	
	public Mine () {
		
		size = 10;
	}
	
	public Mine(int size) {
		
		this.size = size;
		
	}
	
	
	public String [][] make() {
		
		arr = new String[size][size];
		
		fillTheZero();
		
		randomMine() ;
		cntMine();
		
		return arr;
	}
	
	private void fillTheZero() {
		
		for(int i = 0; i<arr.length;i++) {
			
			for(int j = 0; j<arr.length;j++) {
				
				arr[i][j] = "0";
			}
		}
	}
	private void randomMine() {
		
		int cnt = size;
		while(cnt !=0) {
			
			int ranx = (int) (Math.random()* size);
			int rany = (int) (Math.random()*size);
			
			if(!arr[ranx][rany].equals("*")){
				
				arr[ranx][rany] = "*";
				cnt--;
				
			
				
			}
		}
		
	}
	
	
	private void cntMine() {
		
		for(int i = 0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				if(!arr[i][j].equals("*")) {
					
					arr[i][j] = String.valueOf(count(i,j)) ;
				}
			}
		}
	}
	
	
	
	private int count(int x, int y) {
		
		
		int cnt =0;
		
		for(int i = x-1; i<=x+1;i++) {
			
			for(int j=y-1; j<=y+1;j++) {
				
				if(i<0 || j<0) {
					
					continue;
				}
				if(i>arr.length-1 || j>arr.length-1) {
					continue;
				}
				
				if(arr[i][j].equals("*")) {
					
					cnt++;
				}
			}
		}
		
		
		return cnt;
		
		
	}
	public void prn() {
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				System.out.printf("%3s", arr[i][j]);
	
			}
			System.out.println();
			
		}
		
		
	}
	
}
