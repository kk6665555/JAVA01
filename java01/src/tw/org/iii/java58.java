package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class java58 {

	public static void main(String[] args) {
		try {
			ServerSocket a = new ServerSocket(1234);
			Socket socket= a.accept();
			
			BufferedOutputStream b = new BufferedOutputStream(new FileOutputStream("./one1/iii.png"));
			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());
			byte[] buf = new byte[7000];int len;
			while((len=bin.read(buf))!=-1){
				b.write(buf,0,len);
			}
			bin.close();
			b.flush();
			b.close();
			
			
			a.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
