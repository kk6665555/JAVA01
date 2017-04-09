package tw.org.iii;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class java51 {

	public static void main(String[] args) {
		brad513 a = new brad513();
		//§Ç¦C
		try {
			ObjectOutputStream oot=new ObjectOutputStream(new FileOutputStream("./AA/brad511"));
			oot.writeObject(a);
			oot.flush();
			oot.close();
			System.out.println("ok");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("-------");
		//¸Ñ§Ç
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./AA/brad511"));
			brad513 obj = (brad513)oin.readObject();
			oin.close();
		} catch (Exception e) {
		}
	}

}
class brad511 {
	brad511(){System.out.println("brad511()");}
}
class brad512 extends brad511{
	brad512(){System.out.println("brad512()");}

}
class brad513 extends brad512 implements Serializable{
	brad513(){System.out.println("brad513()");}

}