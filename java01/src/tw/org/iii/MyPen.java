package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyPen  extends JPanel implements MouseListener{
	private int x0,x1,y0,y1,x,y,w,h;
	public MyPen(){
			setBackground(Color.black);
			addMouseListener(this);
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
