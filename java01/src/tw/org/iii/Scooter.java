package tw.org.iii;

public class Scooter extends Bike {//�~�� �S�����w�غc���ɰߤ@���غc���l���L�ǰѼƫغc��
	Scooter(){
		//super();
		System.out.println("Scooter");
	}
	void upSpeed(){
		super.upSeed();
		speed = (speed<1)?1.5:(speed*3.2);
	}
}
