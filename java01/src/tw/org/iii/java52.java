package tw.org.iii;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URL;

public class java52 {

	public static void main(String[] args) {
	try {
		InetAddress ips = InetAddress.getByName("www.hinet.net");
		System.out.println(ips.getHostAddress());
	} catch (Exception e) {
		System.out.println(e.toString());
	}	
	}
}
