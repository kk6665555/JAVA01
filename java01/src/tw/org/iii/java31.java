package tw.org.iii;

public class java31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StringBuffer sb1 = new StringBuffer();//StringBuffer 適合string資料的異動
			StringBuffer sb2 = sb1;
			sb1.append("12345678901234567");
			System.out.println(sb1.capacity());//字元  
			System.out.println(sb1.length());//字元  16不夠用會自動加大
			System.out.println(sb1==sb2);
	}

}
