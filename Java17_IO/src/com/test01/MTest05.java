package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MTest05 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		File fi = new File("C:\\");
		//prn01(fi);
		
		//dir 의 총갯수 : 개
		//file 의 총갯수 : 개
		prn02(fi);
		
	}

	
	
	public static void prn01(File fi) {
		
		
		for(String list : fi.list()) {
			
			System.out.println(list);
		}
	}
	
	public static void prn02(File fi)  {
		
		int dirCnt = 0;
		int fileCnt = 0;
		
		for(File f : fi.listFiles()){
			
			if(f.isDirectory() ) {
				dirCnt++;
				System.out.println("dir : " + f.getName());
				
			}else if(f.isFile()) {
				fileCnt++;
				System.out.println("file :"+ f.getName());
			}
			
			
			
		}
		
		System.out.println("dir의 총갯수 : " + dirCnt);
		System.out.println("file의 총갯수 : " + fileCnt);
		
		
	}
}
