package tw.org.iii;

import javax.swing.JOptionPane;

public class java10 {

	public static void main(String[] args) {
		//1.create Answer
		String answer =creatanswer(3);
		System.out.print(answer);
		
		//2.Start
		boolean iswinner= false;
		for (int i = 0 ;i <10 ; i++){
			//2.1 input a number string
			String guess = JOptionPane.showInputDialog("猜一個數字");
			//2.2 compare string => result
			String result = checkAB(answer,guess);
			JOptionPane.showMessageDialog(null, result);
			if (result.equals("3A0B")){
			//2.3 win
			 iswinner=true;
			 break;
			}	
			//2.4 repeat 10 times > loss
		}
		//3. show .. ..
		if(iswinner){
			JOptionPane.showMessageDialog(null,"恭喜答對");
		}else{
			JOptionPane.showMessageDialog(null, "Losser, Answer is " + answer);
		}
	}

	
	
	//method: cheackAB(answer,guess)
	static String checkAB(String a, String b){
		int A , B; A = B = 0 ;
		for (int i = 0; i< b.length();i++){
			if (b.charAt(i)==a.charAt(i)){
				A++;
			}else if(a.indexOf(b.charAt(i))>= 0){
				B++;
			}
			
		}
		return A +"A"+B+"B";
	}

	
	
	
	
	
	
	//method: create a answer
	static String creatanswer(int d){
		//洗牌
		boolean[] cheak = new boolean[10];// 0 - 51 ; false
		int[] poker = new int[d];
		int temp;
		for(int i = 0 ; i < 3 ; i++){
			do{
				temp = (int)(Math.random()*10);
			}while(cheak[temp]);		
				poker[i]=temp;
				cheak[temp]=true;
		}
		
		String ret="";
		for(int v:poker) ret += v;
		return ret;
		//return "" + poker[0] +poker[1]+poker[2];
	}

}
