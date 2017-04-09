package tw.org.iii;

public class ocjp48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x ={1,2,3};
		int y[] ={4,5,6};
		go(x,y);
	}
	static void go(int[]...z){
		//=>int[] []=>{{1,2,3},{4,5,6}}
		for(int[]a:z){
			System.out.print(a[0]);
		}
	}

}
