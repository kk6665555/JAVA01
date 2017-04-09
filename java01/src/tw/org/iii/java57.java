package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class java57 {

	public static void main(String[] args) {
		//TCP
	
		try {
			File a1 =new File("./one/25793-2929291.png"); 
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(a1));
			byte[] buf =new byte[(int)a1.length()];
			bin.read(buf);
			bin.close();
			
			Socket a = new Socket(InetAddress.getByName("127.0.0.1"),1234);
			OutputStream out =a.getOutputStream();
			out.write("1234567890".getBytes());
			out.flush();
			a.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
	}

}
