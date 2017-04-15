package tw.org.iii;

public class java65 {
	
	public static void main(String[] args) {
		//執行緒
		MyThread a =new MyThread("A");
		MyThread a1 = new MyThread("B");
		a.start();//多重執行緒的生命特徵 start不是馬上開始=>排隊等候 有資格跑
		a1.start();
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hellow world");
		
	}
}
//Thread 執行緒 
class MyThread extends Thread{
	private String name;
	MyThread(String name){this.name=name;}
	@Override
	public void run() {
		for(int i=0;i<10;i++){System.out.println(name+ ":" + i);
		try {
			Thread.sleep(100);//0.1秒鐘 睡覺0.1秒
		} catch (InterruptedException e) {
			
		}
		}
	}
}
