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
	void setleg(int n) throws Exception{//�ХX�N�~
		if (n>2 ){
			throw new MyException();//�ߥX�ҥ~
		}else if (n<0){
			throw new MyException2();
		}
		leg = n ;
	}
}

class MyException extends Exception{
	public String tostring(){
		return "�j��2";
	}
}
class MyException2 extends Exception{
		public String tostring(){
			return "�p��2";
	}
}

