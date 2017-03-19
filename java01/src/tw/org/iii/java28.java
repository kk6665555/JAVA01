package tw.org.iii;
public class java28 {
	public static void main(String[] args) {

	}
}
interface Brad291{//interface 介面 只會有方法 先天為public
	void m1(); // public void m1();
	void m2();
}
abstract  class Brad292 implements Brad291{//實作介面 幾個方法都必須做 m1 m2,abstract則可以解決  為多型
	public void m1(){}
}
