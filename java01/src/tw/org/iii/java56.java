package tw.org.iii;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class java56 {

	public static void main(String[] args) {
		try {
			ServerSocket a = new ServerSocket(1234);
			Socket socket= a.accept();
			InputStream in =  socket.getInputStream();
			int i;
			while((i=in.read())!=-1){
				System.out.print((char)i);
			}
			in.close();
			a.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
