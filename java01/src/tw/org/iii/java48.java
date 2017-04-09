package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class java48 {

	public static void main(String[] args) {
	 
		File readfile =new File("./one/25793-2929291.png");
		File savefile =new File("./one1/25793-2929291.png");
		try {
			byte[] a = new byte[(int)readfile.length()];
			FileInputStream fin = new FileInputStream(readfile);
			fin.read(a);
			fin.close();
			
			FileOutputStream fout = new FileOutputStream(savefile);
			fout.write(a);
			fout.flush();
			fout.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
