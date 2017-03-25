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

public class MyPen3  extends JPanel {//介面每個都必須做
	private int x0,x1,y0,y1,x,y,w,h;
	public MyPen3(){
			setBackground(Color.black);
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mousePressed(e);
					x0=e.getX();y0=e.getY();

				}
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseReleased(e);
					x1 = e.getX(); y1 = e.getY();
					int r = Math.abs(x0-x1); 
					w = h = 2*r;
					x = x0 - r;
					y = y0 - r;
					repaint();
				}
			});
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(Color.RED);
		//g2d.drawLine(x0, y0, x1, y1);
		g2d.drawOval(x, y, w, h);
	}

 }