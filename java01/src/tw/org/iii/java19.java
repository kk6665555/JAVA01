package tw.org.iii;

public class java19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a;
		int [] b[];
		int c[][];
		a = new int[2][];//[][]內不可為負數  只有後面[]可為空白
		a[0]=new int[3];
		a[1]=new int[2];
		for (int i=0; i<a.length;i++){
			for (int j = 0 ; j < a[i].length;j++){
				System.out.print(a[i][j] + " ");
			}
		System.out.println();
		}
		
	}

}
