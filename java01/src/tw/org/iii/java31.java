package tw.org.iii;

public class java31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StringBuffer sb1 = new StringBuffer();//StringBuffer �A�Xstring��ƪ�����
			StringBuffer sb2 = sb1;
			sb1.append("12345678901234567");
			System.out.println(sb1.capacity());//�r��  
			System.out.println(sb1.length());//�r��  16�����η|�۰ʥ[�j
			System.out.println(sb1==sb2);
	}

}
