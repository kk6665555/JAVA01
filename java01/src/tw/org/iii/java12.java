package tw.org.iii;

public class java12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike(); //new 物件形成  Bike 物件呼叫
		System.out.println(Bike.counter);

		Bike b2 = new Bike();
		System.out.println(Bike.counter);

		System.out.println("----");

		
		
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());

		b1.upSeed();
		b1.upSeed();
		b1.upSeed();
		
		b2.upSeed(1);
		b2.upSeed(2);

		
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());

	}

}
