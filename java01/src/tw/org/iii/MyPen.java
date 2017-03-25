package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Painter;

public class MyPen  extends JPanel implements MouseListener{//介面每個都必須做
	private int x0,x1,y0,y1,x,y,w,h;
	public MyPen(){
			setBackground(Color.black);
			addMouseListener(this);
			addMouseMotionListener(new MyMouse(this));
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;//強制轉型為原本樣子
		g2d.setStroke(new BasicStroke(8));//筆的粗細
		g2d.setColor(Color.CYAN);
		g2d.drawLine(x0, y0, x1, y1);
		g2d.drawOval(x0, y0,w,h);
		
	}
	void sex0(int x0){this.x0=x0;}
	void sex1(int x0){this.x1=x0;}
	void sey0(int x0){this.y0=x0;}
	void sey1(int x0){this.y1=x1;}
	
	void changeLine(int x, int y){
		this.x1=x1; this.y1=y1;
		int r =Math.abs(x0-this.x1);
		w =h= 2*r;
		x=x0-r;
		y=y0-r;
		repaint();
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
			x0=e.getX();y0=e.getY();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
			x1=e.getX();y1=e.getY();
			int r =Math.abs(x0-x1);
			w =h= 2*r;
			x=x0-r;
			y=y0-r;
			repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
 class MyMouse extends MouseAdapter{//抽象可以只做其中幾個
	 
	 private MyPen painter;
	 public MyMouse(MyPen painter){
		 this.painter=painter;
	 }
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mousePressed(e);
		//x0=e.getX();y0=e.getY();
		painter.sex0(e.getX());
		painter.sex1(e.getX());

	}@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
//		x1=e.getX();y1=e.getY();
//		int r =Math.abs(x0-x1);
//		w =h= 2*r;
//		x=x0-r;
//		y=y0-r;
//		repaint();
//		super.mouseReleased(e);
	}
 }