package tw.org.iii;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class MyPool extends JPanel{
	private Ball ball;
	private Timer timer;
	private int vieww,viewh,dx,dy;
	public MyPool(){
		timer=new Timer();
		ball = new Ball(dx,dy);
		dx=dy=10;
		timer.schedule(ball, 1000,60);
	}
	@Override
	protected void paintComponent(Graphics arg0) {
		Graphics2D g2d=(Graphics2D)arg0;
		
		vieww=getWidth();viewh=getHeight();
		
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, 640, 480);
		
		g2d.setColor(Color.white);
		g2d.fillOval(ball.x,ball.y, 30, 30);
	}
	
	private class Ball extends TimerTask{
		int x,y;
		public Ball(int x,int y){this.x=x;this.y=y;}
		@Override
		public void run() {
			if(x<0|| x +30>vieww){
				dx*=-1;
			}
			if(y<0|| y +30>viewh){
				dy*=-1;
			}
			x+=dx;
			y+=dy;
			repaint();
			
		}
	}
	
}
