package tw.org.iii;

public class java33 {
	public static void main(String[] args) {
		Brad431 a = new  Brad431();
		Brad431.Brad432 a2=a.new Brad432();
		a2.m1();
		Brad431.Brad433 a3 =new Brad431.Brad433();
		a3.m1();
		a.m3();
	}
}
class Brad431{
	Brad431(){System.out.println("Brad431()");}
	void m1(){System.out.println("Brad431():m1()");}
	void m2(){System.out.println("Brad431():m2()");}
	static void m3(){System.out.println("Brad431:m3");}
		class Brad432{
			Brad432(){System.out.println("Brad432()");}
			void m1(){
				System.out.println("Brad432():m1");
				Brad431.this.m1();
			}
		}
		static class Brad433{
			Brad433(){System.out.println("Brad433()");}
			void m1(){
				System.out.println("Brad433():m1");
				
			}
		}
}

