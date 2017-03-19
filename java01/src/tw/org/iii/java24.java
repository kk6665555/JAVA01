package tw.org.iii;

public class java24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Brad253 a = new Brad253();
		//Brad253 b = new Brad253();
		Brad253.m1();

	}

}
class Brad251{
	static {System.out.println("s3");}
	Brad251(){System.out.println("Brad251()");}
	Brad251(int a){System.out.println("Brad251(int)");}
}
class Brad252 extends Brad251{
	static {System.out.println("s3");}
	Brad252(String a){
		//super()
		//super(2);
		System.out.println("Brad252(string)");
	}
}
class Brad253 extends Brad252{
	static {System.out.println("s3");}
	Brad253(){
		super("Brad");
		System.out.println("Brad253()");
	}
	static void m1(){
		System.out.println("m1()");
	}
}
