package tw.org.iii;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class java49 {

	public static void main(String[] args) {
		Student a = new Student("aa",60,70,75);
		Student a1 = new Student("ab",90,98,92);

//		System.out.println(a.sum());
//		System.out.println(a.avg());
		try {
			ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("./AA/Brad.object"));
			out.writeObject(a);
			out.writeObject(a1);

			out.flush();
			out.close();
			
			System.out.println("ok");
			
		} catch (Exception e) {
		}
		
	}

}
