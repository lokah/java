package com.test01;



	import java.io.*;
	public class Test02 {
	    public static void main(String[] args) {
	    	
	    	BufferedReader bReader = null;
	        String input = null;
	        try {
				bReader = new BufferedReader(new FileReader("out.txt"));
    
				input = bReader.readLine();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}System.out.println(input);
	        
	    }
	}


