package tw.org.iii;

public class TWid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TWid id1 = new TWid();
		TWid id2 = new TWid(1);
		TWid id3 = new TWid(false);
		TWid id4 = new TWid(true,12);
		
		System.out.println(id1.getid());
		System.out.println(id2.getid());
		System.out.println(id3.getid());
		System.out.println(id4.getid());

		
//		System.out.println(id1.getid());
//		if (id1.Resume()){
//			System.out.print("¤k");
//		}else{
//			System.out.print("¨k");

		}
	}


