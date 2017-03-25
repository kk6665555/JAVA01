package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class java39 {

	public static void main(String[] args) {
		File file = new File("./one/piece.txt");//("c:\test\brad.txt");	//字串裡有跳脫自元\後面必須接b t n f r 
//		if (file.exists()){\\判斷是否在
//			System.out.println("OK:" + file.getAbsolutePath());
//		}else{
//			System.out.println("錯誤");
//		}
		try{
		FileInputStream fin = new FileInputStream(file);//必須使用try 因為有例外FileNotFoundException
		//	int date=fin.read();//只有一個字元回傳
			byte [] buf = new byte[2];
			int temp;
			while( (temp=fin.read(buf)) != -1){
				System.out.print(new String(buf,0,temp));
			}

			fin.close();
//		}catch(FileNotFoundException aa){
//			System.out.println(aa.toString());
//		}catch(IOException aa){ //由小類別到大類別
//			System.out.println(aa.toString());
		}catch(Exception aa){
			System.out.println(aa.toString());
		}
	}

}
