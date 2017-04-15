package tw.org.iii;

import java.util.Timer;
import java.util.TimerTask;



public class java68 {
private static Timer timer;//不鼓勵使用static 
//private Timer timer
	public static void main(String[] args) {
		timer = new Timer(); 
		timer.schedule(new Mytask("A"),1000,1000);//如何變快慢 跳過不做變慢 
		timer.schedule(new Mytask("B"),1000,200);
		timer.schedule(new Mystop(), 10*1000);
		System.out.println("main");
	}
	public static class Mystop extends TimerTask{
		@Override
		public void run() {
			timer.cancel();
		}
	}
}

class Mytask extends TimerTask{//因為使用內部類別 所以須使用static
	private String name;
	private int i ;
	Mytask(String name){this.name=name;}
	
	@Override
	public void run() {
		System.out.println(name + "ok");
	}
}
class Stopjava extends TimerTask{
	private Timer timer;
	Stopjava(Timer timer){this.timer=timer;}
	@Override
	public void run() {
		timer.cancel();
		
	}
}
