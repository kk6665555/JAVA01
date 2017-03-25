package tw.org.iii;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class java42 {

	public static void main(String[] args) {
		File file = new File("./one/Book1.csv");
		String temp ;
		try{
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		while((temp=br.readLine())==null);{
		System.out.println((temp));
		}
		br.close();
		}catch(Exception aa){
			System.out.println(aa.toString());
		}
	}

}
