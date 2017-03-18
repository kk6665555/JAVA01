package tw.org.iii;

public class Bike {//
	 double speed; //private 私有的 只有這裡可以使用 (封裝)
	int a = 0;
	//static int b = 0;//static屬於該類別
	static int counter;
	
	
	
	Bike(){	
		//speed = 0.0;
		//System.out.println("test");
		this(0);
	}
	Bike(double s){
		speed = s ;
		a++ ;  counter++; //b++;
		System.out.println("test2");
	}
	Bike(int s){
		this(s*1f);
		//System.out.println("test");
	}
	Bike(float s){
		this(s*1.0);
		//speed = s ;
		//System.out.println("test");
	}
	void upSeed(){
		speed = (speed<1)?1:(speed*2);//如果speed小於1變成1 再來沒有小於則speed會*2
	}
	void upSeed(int gear){
		speed = (speed<1)?1:(speed*(1.2+gear));//如果speed小於1變成1 再來沒有小於則speed會*2
	}
	void downSpeed(){
		speed *= 0.2;
	}
	double getSpeed(){
		return speed;
	}
}
