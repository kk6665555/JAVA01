package tw.org.iii;

public class Bike {//
	 double speed; //private �p���� �u���o�̥i�H�ϥ� (�ʸ�)
	int a = 0;
	//static int b = 0;//static�ݩ�����O
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
		speed = (speed<1)?1:(speed*2);//�p�Gspeed�p��1�ܦ�1 �A�ӨS���p��hspeed�|*2
	}
	void upSeed(int gear){
		speed = (speed<1)?1:(speed*(1.2+gear));//�p�Gspeed�p��1�ܦ�1 �A�ӨS���p��hspeed�|*2
	}
	void downSpeed(){
		speed *= 0.2;
	}
	double getSpeed(){
		return speed;
	}
}
