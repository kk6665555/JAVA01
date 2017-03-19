package tw.org.iii;

public class java32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Brad421 b1 = new Brad422();
			Brad422 b2 = (Brad422)b1;//須強制轉型
			Brad421 b3 = new Brad423();
			Brad422 b4 = (Brad422)b3;//編譯成功(同) 轉型例外 執行錯誤
			b2.m1();
	}

}
class Brad421{
	void m1()  {System.out.println("Brad421:m1");}
	
}
class Brad422 extends Brad421{
	void m1()  {System.out.println("Brad422:m1");}
	void m2()  {System.out.println("Brad422:m2");}

}
class Brad423 extends Brad421{
	void m1()  {System.out.println("Brad423:m1");}
	void m2()  {System.out.println("Brad423:m2");}

}