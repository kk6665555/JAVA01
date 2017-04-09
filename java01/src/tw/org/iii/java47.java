package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class java47 {

	public static void main(String[] args) {
	 
		File readfile =new File("./one/25793-2929291.png");
		File savefile =new File("./one1/25793-2929291.png");
		try {
			FileOutputStream fout = new FileOutputStream(savefile);
			FileInputStream fin = new FileInputStream(readfile);
			int b ;
			while ((b=fin.read())!=-1) {
				fout.write(b);
			}
			fin.close();
			fout.flush();
			fout.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
