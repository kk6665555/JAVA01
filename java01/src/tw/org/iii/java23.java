package tw.org.iii;

import java.util.Arrays;

public class java23 {

	public static void main(String[] args) {
		//洗牌
		boolean[] cheak = new boolean[52];// 0 - 51 ; false
		int[] poker = new int[52];
		int temp;
		for(int i = 0 ; i < 52 ; i++){
			do{
				temp = (int)(Math.random()*52);
			}while(cheak[temp]);		
				poker[i]=temp;
				cheak[temp]=true;
			System.out.println(poker[i]);
		}
		//發牌
		int[][] player = new int[4][13];
		for(int i = 0 ;i < poker.length ;i ++){
			player[i%4][i/4] = poker[i] ; 
		}
		System.out.println("--");
		//驗算 第一家
		//for (int v : player[0]){
		//	System.out.println(v);
		//攤牌
		String[]  suit = {"黑桃","紅心","方塊","梅花"};//suit[0]
		String[]  valus = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};//valus[0]
		for (int[] cards:player){
			//理牌
			Arrays.sort(cards);//理牌
			for (int card : cards){
				System.out.print(suit[card/13]+ valus[card%13] +"  ");
			}
			System.out.println();
		}
	}
}

