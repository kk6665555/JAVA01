package tw.org.iii;

import javax.swing.JOptionPane;

public class java03 {
	public static void main(String[] aa){
		String input = JOptionPane.showInputDialog("��J�~��");
		
		int year = Integer.parseInt(input);
		if (year % 4 == 0){
			if (year % 100 == 0){
				if (year % 400 == 0){
					System.out.println("�|�~");//29
				}else{
					System.out.println("���O�|�~");//28
				}				
			}else{
				System.out.println("���O�|�~");//28
			}
		}else{
			System.out.println("���O�|�~");//28	
		}
	}

}
