package tw.org.iii;

public class java26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brad271 b1 = new Brad272();
		Brad271 b2 = new Brad273();
		b1.m2();
		b2.m2();
		
	}
}
abstract class Brad271{//abstract 宣告抽象類別
	Brad271(){System.out.println("Brad271");}
	void m1(){System.out.println("Brad271:m1");}
	abstract void m2();
}
class Brad272 extends Brad271{
	void m2(){System.out.println("Brad271:m2");}
	
}
class Brad273 extends Brad271{
	void m2(){System.out.println("Brad271:m2");}
	
}
abstract class Brad274 extends Brad271{
	void m3(){}
	abstract void m4();
}

