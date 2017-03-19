package tw.org.iii;

public class java27 {

	public static void main(String[] args) {
		
	}
}

class Brad281{
	//void m1(){}
	 Brad283  m1(){return new Brad283();}
	 String m2(){return "";}
}
class Brad282 extends Brad281{
	 //void m1(){} //傳回型別必須與父類別一模一樣(修飾字原則 只可變大 不可變小)
	 Brad284  m1(){return new Brad284();}

}
class Brad283 {}
class Brad284 extends Brad283{}