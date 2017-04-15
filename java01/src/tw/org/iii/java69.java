package tw.org.iii;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class java69 extends JFrame{
	private Mytime mytime;
	private MyPool mypool;
	java69(){
		setLayout(new BorderLayout());
		
		mytime=new Mytime();
		mypool=new MyPool();
		add(mytime,BorderLayout.NORTH);
		add(mypool,BorderLayout.CENTER);
		
		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new java69();
	}

}
