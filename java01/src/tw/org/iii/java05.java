package tw.org.iii;

public class java05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		final int b = 10 ;//final ������ܪ��Ʀr
		switch(a){
		case 1:
			System.out.println("a");
			break;
		case b://���|�ܪ�����
			System.out.println("b");
			// break; �i�H�S��
		case 15:
			System.out.println("c");
			break;
		case 20:
			System.out.println("d");
			break;
		//�򥻫��O int�H�� ��L�y�k���~
		}
	}

}
