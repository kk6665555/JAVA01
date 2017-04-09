package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;

public class java59 {

	public static void main(String[] args) {
		try {
			URL ur = new URL("https://tw.news.yahoo.com/%E5%B7%9D%E7%BF%92%E6%9C%83%E8%90%BD%E5%B9%95-%E5%AD%B8%E8%80%85%EF%BC%9A%E4%B8%AD%E7%BE%8E%E6%87%89%E6%9C%89%E8%AB%87%E6%96%AC%E9%A6%96%E9%87%91%E6%AD%A3%E6%81%A9-054454864.html");
			URLConnection conn = ur.openConnection();
			
			InputStream in = conn.getInputStream();
			BufferedOutputStream b = new BufferedOutputStream(new FileOutputStream("./one1/iii.png"));
			BufferedInputStream bin = new BufferedInputStream(in);
			byte[] buf = new byte[7000];int len;
			while((len=bin.read(buf))!=-1){
				b.write(buf,0,len);
			}
			bin.close();
			b.flush();
			b.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
