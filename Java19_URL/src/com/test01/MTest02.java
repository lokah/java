package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MTest02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		URL url = new URL("https://www.padi.co.kr/sites/default/files/images/2019-02/greece.jpg");
		
		
				byte[] b= new byte[1];
		URLConnection urlConnection = url.openConnection();
		urlConnection.connect();
		
		DataInputStream di =
				new DataInputStream(urlConnection.getInputStream());
				
				FileOutputStream fo = new FileOutputStream("a.jpg");
				
				
				while(di.read(b,0,1) !=-1) {
					fo.write(b,0,1);
				}
				
				fo.close();
				di.close();
	}

}
