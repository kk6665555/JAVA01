package tw.org.iii;
//Exception 例外
public class java34 {
	public static void main(String[] args) {
		int a = 10 , b = 3 ;
		int[] c={1,2,3,4};
		try{
			System.out.println(a / b);//0為例外
			System.out.println(c[4]);
		}catch(ArithmeticException aa){//ArithmeticException 算術例外 (如果產生算數例外)
			System.out.println("例外產生");
		}catch(ArrayIndexOutOfBoundsException ab){//陣列例外
			System.out.println("陣列例外產生");
		}catch(RuntimeException ac){
			System.out.println("no problem");
		}
		System.out.println("Hellow");
	}

}
