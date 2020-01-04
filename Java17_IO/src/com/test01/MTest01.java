package com.test01;

import java.io.File;
import java.io.IOException;

public class MTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fi = new File("C:/test_io");
		if(fi.exists()) {
			
			System.out.println("exists!");
		}else {
			System.out.println("new");
			fi.mkdir();
		}
		
		File fic1 = new File(fi, "AA");
		fic1.mkdir();
		
		File fic2 = new File("C:/test_io", "BB");
		fic2.mkdir();
		
		File fitxt = new File(fic1,"a.txt");
		
		try {//checked exception
			fitxt.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
