package tw.org.iii;

public class java21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		int[] poker = new int[52];
		for (int i=0;i<52 ;i++){
			int temp = (int)(Math.random()*52);
			//ÀË¬d¾÷¨î
			boolean isrepeat = false;
			for (int j = 0 ; j<i ; j++){
				if (poker[j]==temp){
					isrepeat=true;
					break;
				}
			}
			if(!isrepeat){
				poker[i]=temp;
				System.out.println(poker[i]);
			}else{
				i--;
			}
		}
		System.out.println(System.currentTimeMillis() - start);
	}

}
