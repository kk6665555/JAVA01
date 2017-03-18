package tw.org.iii;

public class java04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b=3;
		int v1 = 10 ,v2 = 3;
		int v3 = v1 | v2;
		System.out.println(v3);
		if (++a>=10 & b--<=3){
			System.out.print("ok:a="+a+",b="+ b);
		}else{
			System.out.print("xx");
		}
	}

}
