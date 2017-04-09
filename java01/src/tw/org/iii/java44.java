package tw.org.iii;

import java.io.File;
import java.io.FileOutputStream;

public class java44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String date = "aa, aa123\nbb1\nbb2";
		File b = new File("./AA/AA.txt");
		try {
			FileOutputStream a = new FileOutputStream(b) ;//假設沒有資料FileOutputStream 會自動建立
//			FileOutputStream a = new FileOutputStream(b,true);//繼續補下去
//			a.write(date.getBytes());
			a.flush();//卸載的動作  !!!重要!!!
			a.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
