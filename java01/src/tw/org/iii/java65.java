package tw.org.iii;

public class java65 {
	
	public static void main(String[] args) {
		//�����
		MyThread a =new MyThread("A");
		MyThread a1 = new MyThread("B");
		a.start();//�h����������ͩR�S�x start���O���W�}�l=>�ƶ����� �����]
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
//Thread ����� 
class MyThread extends Thread{
	private String name;
	MyThread(String name){this.name=name;}
	@Override
	public void run() {
		for(int i=0;i<10;i++){System.out.println(name+ ":" + i);
		try {
			Thread.sleep(100);//0.1���� ��ı0.1��
		} catch (InterruptedException e) {
			
		}
		}
	}
}
