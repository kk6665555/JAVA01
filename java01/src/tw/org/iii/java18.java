package tw.org.iii;

public class java18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;//int a[]; �]�i�H �x��j�P��ĳ�Ĥ@��
		a = new int[3];//�}�C���Ŷ��W�w
		int [][] y;
		int y1 [][];
		int [] y2[];
		int[] y3 = new int[4];//1 2 3 4
		
		System.out.println(a.length);//�}�C������
		for (int b = 0 ; b<a.length; b++){
			System.out.println(a[b]);
			
		
		}
		int[] r;
		r = new int[6];
		for (int c = 0; c <=100000; c++){
		int dice = (int)(Math.random()*9);//0-9  6 7 8
			r[(dice>=6)?dice-3:dice]++;// �T���B�⦡
		}
		for (int q = 0 ; q < r.length; q++){
			System.out.println(q+1 + "�I�X�{" + r[q] + "��");
		}
		System.out.println();
	}
}
