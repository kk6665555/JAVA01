package tw.org.iii;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class Mytime extends JLabel{	
	private Timer timer;int i;
	public Mytime(){
		timer = new Timer();
		timer.schedule(new MyTimeTask(), 0,1000);//馬上做 間隔一秒鐘
		
		
		
	}
	private class MyTimeTask extends TimerTask{
		@Override
		public void run() {
			Calendar now = Calendar.getInstance();//Calendar  時間的api
			int hh=now.get(Calendar.HOUR_OF_DAY);
			int mm=now.get(Calendar.MINUTE);
			int ss=now.get(Calendar.SECOND);
			setText(hh + ":"+ mm +":"+ ss);
		}
	}
}
