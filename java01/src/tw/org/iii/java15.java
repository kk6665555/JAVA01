package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class java15 extends JFrame{
	private JButton open,save,exit;
	private MyPen MyPen3;
	public java15(){
		//super();
		super("����");
		
		//setLayout(new FlowLayout(FlowLayout.LEFT));//�h�� setLayout ��JFrame�̭���
		setLayout(new BorderLayout());
		open=new JButton("Open");
		save=new JButton("Save");
		exit=new JButton("Exit");	
//		add(open, BorderLayout.NORTH); 
//		add(save,BorderLayout.SOUTH); 
//		add(Exit,BorderLayout.CENTER);
		JPanel TOP= new JPanel(new FlowLayout());
		MyPen3=new MyPen();
		TOP.add(open);		TOP.add(save);		TOP.add(exit);
		
		add(TOP,BorderLayout.NORTH);//���border���_��
		add(MyPen3,BorderLayout.CENTER);
		
		
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//���e�e�|����
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new java15();
	}

}
