package tw.org.iii;

public class java02 {
	public static void main (String[] args){
	double soure = Math.random()*101;
	//math.random �ƭȬ�0-1 ���]�A1
	//random�M�ü�  �d�� 0 �� 99 ����100 ���p���I
	// soure ��  0 - 100
	int intsorce = (int)(soure);
	
	System.out.println(intsorce);
	
	if (intsorce>=90){
		System.out.println("A");
	}else if (intsorce>=80){
		System.out.println("B");
	}else if (intsorce>=70){
		System.out.println("c");
	}else if (intsorce>=60){
		System.out.println("D");
	}else{
		System.out.println("E");
		System.out.println("Game over");// ���ԭz�y    {}�̭��~��϶�}
	}
	}
	}



