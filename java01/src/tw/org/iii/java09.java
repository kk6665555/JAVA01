package tw.org.iii;

public class java09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = new String();
		byte [] b1 = {97,98,99,100,101,102,103};//abcde
		String a2 = new String(b1);
		
		String a3 = new String(b1,2,4);//�g����Ӧ�l ��4�Ӫ��� 
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		String a4="abcdef";//���޸�""�̭����������
		char c1 = a2.charAt(3);
		System.out.println(c1);
		System.out.println("abcdefg".charAt(3));
	}

}
