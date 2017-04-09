package tw.org.iii;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class java53 {

	public static void main(String[] args) {
		//UDP/TCP
		String date = "6666";
		byte[] a = date.getBytes();
		try {
			DatagramSocket socket =new DatagramSocket();
			DatagramPacket packet =new DatagramPacket(a, a.length,InetAddress.getByName("127.0.0.1"),8888);
			socket.send(packet);
			socket.close();
			System.out.println(packet.getAddress().getHostAddress());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
