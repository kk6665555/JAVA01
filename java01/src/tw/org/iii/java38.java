package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class java38 {

	public static void main(String[] args) {
		File file = new File("./one/piece.txt");//("c:\test\brad.txt");	//�r��̦�����ۤ�\�᭱������b t n f r 
//		if (file.exists()){\\�P�_�O�_�b
//			System.out.println("OK:" + file.getAbsolutePath());
//		}else{
//			System.out.println("���~");
//		}
		try{
		FileInputStream fin = new FileInputStream(file);//�����ϥ�try �]�����ҥ~FileNotFoundException
			int date=fin.read();//�u���@�Ӧr���^��
			
			int temp;
			while( (temp=fin.read()) != -1){
				System.out.print((char)(temp));
			}

			fin.close();
//		}catch(FileNotFoundException aa){
//			System.out.println(aa.toString());
//		}catch(IOException aa){ //�Ѥp���O��j���O
//			System.out.println(aa.toString());
		}catch(Exception aa){
			System.out.println(aa.toString());
		}
	}

}
