package tw.org.iii;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public class java54 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			socket.close();
			int len = packet.getLength();
			byte[] r = packet.getData();
			String a = packet.getAddress().getHostAddress();
			System.out.println(a +"=>" + new String(r,0,len));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}

}
