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
//static void say(String ... names){//不定各數的字串傳遞(當有明確的表示先跑確定的)
//	 System.out.println("ok");
//	 for (String name:names){
//		 System.out.println("111"+name);
//	 }
//}
static void say(String name1, String ... names){//至少要有一個字串參數且只能有一種不定個數需要放在後面
	 for (String name:names){
		 System.out.println("111"+name);
	 }
}
//static void say1(String[] names){//與上列相同重複定義
//	 for (String name:names){
//		 System.out.println("123"+name);
//	 }
//}
}
