package tw.org.iii;

public class java43 {
	 public static void main(String[] args){
//	 say("4");
//	 say("5","6");
	 say("1","2","3");
//	 say1(new String[]{"1","2","3"});
}
//static void say(String name){
//	 System.out.println("YA," + name);
//}
//static void say(String name1,String name2){
//	 System.out.println("YA," + name1);
//	 System.out.println("YA," + name2);
//}
//static void say(String ... names){//���w�U�ƪ��r��ǻ�(�����T����ܥ��]�T�w��)
//	 System.out.println("ok");
//	 for (String name:names){
//		 System.out.println("111"+name);
//	 }
//}
static void say(String name1, String ... names){//�ܤ֭n���@�Ӧr��ѼƥB�u�঳�@�ؤ��w�Ӽƻݭn��b�᭱
	 for (String name:names){
		 System.out.println("111"+name);
	 }
}
//static void say1(String[] names){//�P�W�C�ۦP���Ʃw�q
//	 for (String name:names){
//		 System.out.println("123"+name);
//	 }
//}
}
