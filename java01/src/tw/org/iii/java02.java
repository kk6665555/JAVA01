package tw.org.iii;

public class java02 {
	public static void main (String[] args){
	double soure = Math.random()*101;
	//math.random 數值為0-1 不包括1
	//random危亂數  範圍 0 到 99 不到100 有小數點
	// soure 為  0 - 100
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
		System.out.println("Game over");// 為敘述句    {}裡面才算區塊}
	}
	}
	}



