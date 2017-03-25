package tw.org.iii;

public class java35 {

	public static void main(String[] args) {
		Bird b = new Bird();
		int n =4;
		try{
			b.setleg(n);
		}catch(MyException ee){
			System.out.println(ee.tostring());
		}catch(MyException2 ee){
			System.out.println(ee.toString());
		}catch(Exception ee){
		}
		System.out.println("end");
	}
}
class Bird{
	private int leg;
	void setleg(int n) throws Exception{//標出意外
		if (n>2 ){
			throw new MyException();//拋出例外
		}else if (n<0){
			throw new MyException2();
		}
		leg = n ;
	}
}

class MyException extends Exception{
	public String tostring(){
		return "大於2";
	}
}
class MyException2 extends Exception{
		public String tostring(){
			return "小於2";
	}
}

