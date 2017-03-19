package tw.org.iii;
public class java29 {
	public static void main(String[] args) {
		TripShape s1 = new TripShape(3,4,5,4);
		SquShape s2 = new SquShape(4);
		m1(s2);
		s1.isTriShape();
	}
static void m1(Shape s){
	System.out.println(s.calArea());
}
}
interface Shape{
	double callength();
	double calArea();
}
class TripShape implements Shape{
	private double s1,s2,s3,h1;
	TripShape(double s1,double s2,double s3,double h1){
		this.s1=s1;	this.s2=s2; this.s3=s3; this.h1=h1;
	}
	public double callength(){
		return s1+s2+s3;
	}
	public double calArea(){
		return s1*h1/2;
	}
	public boolean isTriShape(){
		return true;
	}
}
 class SquShape implements Shape {
	private double s;
	SquShape(double s){
		this.s=s;
	}
	public double callength(){
		return s*4;
	}
	public double calArea(){
		return s*s;
	}
}
