package tw.org.iii;
//Exception �ҥ~
public class java34 {
	public static void main(String[] args) {
		int a = 10 , b = 3 ;
		int[] c={1,2,3,4};
		try{
			System.out.println(a / b);//0���ҥ~
			System.out.println(c[4]);
		}catch(ArithmeticException aa){//ArithmeticException ��N�ҥ~ (�p�G���ͺ�ƨҥ~)
			System.out.println("�ҥ~����");
		}catch(ArrayIndexOutOfBoundsException ab){//�}�C�ҥ~
			System.out.println("�}�C�ҥ~����");
		}catch(RuntimeException ac){
			System.out.println("no problem");
		}
		System.out.println("Hellow");
	}

}
