package tw.org.iii;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

public class java37 {

	public static void main(String[] args) {
		new Brad471().m1();
	}

}
class Brad471{
	void m1() {
		try{			
			System.out.println("do");
			throw new Exception();
		}catch(Exception ee){
			System.out.println("�즹�@�C");
			return;
		}finally{
			System.out.println("ok");
		}
		//System.out.println("end"); //��return���� ������o��
	}
}