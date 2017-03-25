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

public class MyPen2  extends JPanel {//介面每個都必須做
	private int x0,x1,y0,y1,x,y,w,h;
	public MyPen2(){
			setBackground(Color.black);
			//addMouseListener(this);
	}
	private class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			x0=e.getX();y0=e.getY();
	}
	}
 }