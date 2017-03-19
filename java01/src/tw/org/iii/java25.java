package tw.org.iii;

public class java25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brad261 b1 = new Brad261();
		Brad261 b2 = new Brad262(); 
		Brad261 b3 = new Brad262(); 
		Brad261 b4 = new Brad263(); 

		b1.m1();//方法為brad262執行 但brad262必須也有m1方法
		System.out.println(b1.a);
		myf1(b1);
	}
	static void myf1(Brad261 b){
		b.m1();//看帶進去的是b1 b2 b3 b4 哪一個 帶哪個跑哪個
	}

}
class Brad261{
	int a;
	Brad261(){a++; System.out.println("Brad261");}
	void m1(){System.out.println("Bradb1:m1");}
}
class Brad262 extends Brad261{
	int b;
	Brad262(){a++;System.out.println("Brad262");}
	void m1(){System.out.println("Bradb2:m1 b=" + b);}
	void m2(){System.out.println("Bradb2:m2");}


}
class Brad263 extends Brad261{
	
}
