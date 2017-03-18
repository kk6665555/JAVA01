package tw.org.iii;

public class java22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int[] poker = new int[52];
		boolean isrepeat;
		int temp ;
		for (int i=0;i<52 ;i++){			
			do{ 
				temp = (int)(Math.random()*52);
				//ÀË¬d¾÷¨î
				isrepeat=false;
				for (int j = 0 ; j<i ; j++){
				if (poker[j]==temp){
					isrepeat=true;
					break;
				}
				}
			}while(isrepeat);
			poker[i]=temp;
			System.out.println(poker[i]);
	}
	}
}

