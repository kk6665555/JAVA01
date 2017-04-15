package tw.org.iii;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame{
	
	private JButton go,stop;
	private JLabel[] lanes = new JLabel[8];
	private Car[] cars = new Car[8];
	private int rank;
	private boolean isr;
	public Racing(){
		super("Racing Game");//名子
		setLayout(new GridLayout(lanes.length+2, 1));;
		
		go=new JButton("go");
		stop=new JButton("stop");
		add(go); 
		add(stop);
		for(int i = 0;i<lanes.length;i++){
			JLabel lane=new JLabel(i+1 + ".");
			lanes[i]=lane;
			add(lane);
		}
		
		
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
				
			}
		});
		
		stop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stop1();
			}
		}); 
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void go(){
		if(!isr){//讓程式不會累加
			isr=true;
			rank=1;
			for(int i = 0;i < lanes.length;i++){
			 lanes[i].setText((i+1) + ". ");
			}
			for(int i = 0 ;i<cars.length;i++){
			 cars[i] = new Car(i);	
			}
			for(int i = 0 ;i<cars.length;i++){
			 cars[i].start();		
			}
		}
	}
	private void stop1(){
		isr=false;
		for(Car car:cars){
			car.interrupt();//停止
	}
	}
	
	private class Car extends Thread{//內部類別 執行緒
		private int lan;
		Car(int lan){this.lan=lan;}
		
		@Override
		public void run() {
			
			for(int i=0;i<100;i++){
				lanes[lan].setText(lanes[lan].getText() + ">");
				try {
					sleep(10+(int)(Math.random()*100));
				} catch (InterruptedException e) {
					return;//結束
				}
			}
			lanes[lan].setText(lanes[lan].getText() + "==>WINNER");
			stop1();
		}
	}
	
	
	public static void main(String[] args) {
		new Racing();
	}
}
