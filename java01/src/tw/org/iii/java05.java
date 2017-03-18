package tw.org.iii;

public class java05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		final int b = 10 ;//final 不能改變的數字
		switch(a){
		case 1:
			System.out.println("a");
			break;
		case b://不會變的長數
			System.out.println("b");
			// break; 可以沒有
		case 15:
			System.out.println("c");
			break;
		case 20:
			System.out.println("d");
			break;
		//基本型別 int以內 其他語法錯誤
		}
	}

}
