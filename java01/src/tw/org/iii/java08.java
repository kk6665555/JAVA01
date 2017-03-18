package tw.org.iii;

public class java08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,2,3,4,5};
		for (int i = 0 ; i < a.length; i++){
			System.out.println(a[i]);
		}
		System.out.println("--");
		for (int v : a){
			System.out.println(v);
		}
		// exfhge 2 <-> 5
		int temp = a[2];
		a[2]=a[5];
		a[5]=temp;
		System.out.println("---");
		for (int v : a){
			System.out.println(v);
		}
		int[][] b = {{1,2,3,4},{5,6,7},{8,9}};
		for (int i = 0; i < b.length ; i++){
			for (int j = 0 ; j < b[i].length; j++){
				System.out.println(b[i][j]);
			}
			System.out.println();
		}
		for (int[] v1 : b){
			for (int v2:v1){
				System.out.println(v2 + "  ");
			}
		System.out.println();
		}
	}

}
