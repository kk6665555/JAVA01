package tw.org.iii;

public class java67 {

	public static void main(String[] args) {
		Brad67 a = new Brad67();
		a.setDaemon(true);//�D�{�ǵ��� ������]����
		a.start();
		
		try {
			Thread.sleep(400);//�ɶ���ǫפ���
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ok");
		
	}

}
class Brad67 extends Thread{
	@Override
	public void run() {
		for(int i = 0;i<10;i++){
			System.out.println(i);
			try {
				Thread.sleep(100);//�ɶ���ǫפ���
			} catch (InterruptedException e) {
				
			}
		}
	}
}
