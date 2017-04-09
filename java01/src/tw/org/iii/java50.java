package tw.org.iii;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class java50 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./AA/Brad.object"));
			Object a = oin.readObject();
			Object b = oin.readObject();

			oin.close();
			Student s1 = (Student)a;
			Student s2 = (Student)b;

			System.out.println(s1.getName() +":"+ s1.sum()+":"+s1.avg());
			System.out.println(s2.getName() +":"+ s2.sum()+":"+s2.avg());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
