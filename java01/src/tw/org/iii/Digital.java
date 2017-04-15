package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Digital extends JFrame{
	private JButton clar,undo,redo,save,open,color;
	private MySign msp;
	public Digital(){
		super("Digital");
		setLayout(new BorderLayout());
		color=new JButton("color");
		clar=new JButton("clar");
		undo=new JButton("undo");
		redo=new JButton("redo");
		JPanel TOP= new JPanel(new FlowLayout());
		TOP.add(clar);	TOP.add(color);	TOP.add(undo);TOP.add(redo);
		
		add(TOP,BorderLayout.NORTH);

		msp=new MySign();
		add(msp,BorderLayout.CENTER);
		
		clar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				msp.clar();
			}
		});
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				msp.undo();
			}
		});
		redo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				msp.redo();
			}
			
		});
		color.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				msp.color();
				
			}
		});
		
		setSize(640, 520);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Digital();
	}

}
