package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class java41 {

	public static void main(String[] args) {
		File file = new File("./one/piece.txt");//("c:\test\brad.txt");	//�r��̦�����ۤ�\�᭱������b t n f r 
//		if (file.exists()){\\�P�_�O�_�b
//			System.out.println("OK:" + file.getAbsolutePath());
//		}else{
//			System.out.println("���~");
//		}
		try {
			FileReader reader= new FileReader(file) ;
			int temp;
			while((temp=reader.read())!=-1){
				System.out.print((char)temp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print(e.toString());
		}
	}

}
