package tw.org.iii;

public class Scooter extends Bike {//繼承 沒有指定建構式時唯一的建構式子為無傳參數建構式
	Scooter(){
		//super();
		System.out.println("Scooter");
	}
	void upSpeed(){
		super.upSeed();
		speed = (speed<1)?1.5:(speed*3.2);
	}
}
