package tw.org.iii;

public class java60 {

	public static void main(String[] args) {

	}

}
interface brad601{
	public void m1();
}
interface brad602 extends brad601{
	public void m2();
}
interface brad603 extends brad601{
	public void m3();
}
interface brad604 extends brad601,brad602{
	public void m3();
}
class brad605 implements brad603{
	public void m1(){}
	public void m3(){}
}
class brad606 implements brad604{
	public void m1(){}
	public void m2(){}
	public void m3(){} 
}

