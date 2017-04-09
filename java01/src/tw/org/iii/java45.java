package tw.org.iii;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.omg.CORBA.DATA_CONVERSION;

public class java45 {

	public static void main(String[] args) {
		int a = 1,b=2; String c = "123";String d = "¸êµ¦·|";
		try {
			FileOutputStream fout = new FileOutputStream("./AA/AA.dat");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(a);
			dout.writeInt(b);
			dout.writeChars(c);
			dout.writeUTF(d);
			
			fout.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
