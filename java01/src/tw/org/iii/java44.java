package tw.org.iii;

import java.io.File;
import java.io.FileOutputStream;

public class java44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String date = "aa, aa123\nbb1\nbb2";
		File b = new File("./AA/AA.txt");
		try {
			FileOutputStream a = new FileOutputStream(b) ;//���]�S�����FileOutputStream �|�۰ʫإ�
//			FileOutputStream a = new FileOutputStream(b,true);//�~��ɤU�h
//			a.write(date.getBytes());
			a.flush();//�������ʧ@  !!!���n!!!
			a.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
