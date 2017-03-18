package tw.org.iii;

public class java17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1,b = 10 ; a<10 ; a++, b--){
			System.out.println(a +":"+ b);
			if (b == 7){
				break;
			}
		}
		System.out.println("------");
		
		for (int a = 0 ; a < 10 ;a++){
			if (a % 2 == 0 ) continue;
			System.out.print(a);
		}
		System.out.println();
		aa:
		for (int a = 0 ; a<10 ;a++){
			for (int b = 9 ; b > 0 ; b--){
				System.out.println(a + ":" + b);
				if (b % 5 == 0) break aa;//只可以跟著迴圈結構
		continue;//可加可不加
			//System.out.print("ok");  執行不到 編譯錯誤
			}
		}
		
	}
}
