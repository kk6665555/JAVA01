package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.dnd.MouseDragGestureRecognizer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.net.ssl.HostnameVerifier;
import javax.swing.JPanel;

public class MySign extends JPanel {
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines,r;
	
	public MySign(){
//		setBackground(Color.BLACK);
		
		mymouse a = new mymouse();
		
		addMouseListener(a);
		addMouseMotionListener(a);
		lines = new LinkedList<>();
		r = new LinkedList<>();
	}
	//1.mouse event  2.data structure 3.draw 
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(8));//µ§ªº²Ê²Ó
		g2d.setColor(Color.CYAN);
		
		for(LinkedList<HashMap<String, Integer>> line :lines){
			for(int i = 1 ; i<line.size()-1;i++){
				HashMap<String, Integer> po =line.get(i-1);
				HashMap<String, Integer> p1 =line.get(i);
				int x0 = po.get("x"),y0 = po.get("y");
				int x1 = p1.get("x"),y1 = p1.get("y");
				g2d.drawLine(x0, y0, x1, y1);				
			}
		}
	}
	public void clar(){
		lines.clear();
		repaint();
	}
	public void undo(){
		r.add(lines.removeLast());
		repaint();
	}
	public void redo(){
		lines.add(r.removeLast());
		repaint();
	}
	
	private class mymouse extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			r.clear();
			super.mousePressed(e);
			LinkedList<HashMap<String, Integer>> line =new LinkedList<>();
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());
			line.add(point);
			lines.add(line);
			
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());
			lines.getLast().add(point);
			repaint();
			
		}
	}
}
