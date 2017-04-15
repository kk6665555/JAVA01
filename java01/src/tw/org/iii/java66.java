package tw.org.iii;

public class java66 {

	public static void main(String[] args) {
		MyThread2 t2 = new  MyThread2("A");//MyThread2還不是執行緒
		Thread tt2 = new Thread(t2);//MyThread2 包在執行緒內
		
		MyThread2 t3 = new  MyThread2("B");
		Thread tt3 = new Thread(t3);
		
		tt2.start();
		tt3.start();
	}

}

//class MyThread1 extends Thread{
//	@Override
//	public void run() {
//		for(int i=0;i<10;i++){
//			System.out.println(i);
//		}
//	}
//}
class MyThread2 implements Runnable{
	String name;
	MyThread2(String name){this.name=name;}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(name+":"+i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
