package tw.org.iii;

import java.util.HashSet;
import java.util.TreeSet;

public class java62 {

	public static void main(String[] args) {
//		HashSet set = new HashSet();
//		set.add(12);set.add(56);set.add(12.3);set.add("Brad");
//		set.add(12.3);set.add(1200);set.add(1200);set.add(12);/*無重複性*/
//		for(Object obj:set){
//			System.out.println(obj);
//		}
		
		
//		TreeSet set = new TreeSet();
//		while(set.size()<6){
//			set.add((int)(Math.random()*49+1));
//		}
//		System.out.println(set);
		
		
//		TreeSet<Integer> set = new TreeSet<>();//泛型
//		set.add(12);set.add(56); //set.add("78"); 事先編譯失敗
//		byte a = 13; set.add(a); //byte=>int=>integer 轉型只有一次
//		System.out.println(set);
		
//		TreeSet<String> set = new TreeSet<>();
//		set.add("1");set.add("2");set.add("12");	
//		for(String obj : set){
//			System.out.println(obj);
//		}
		
		
		
		HashSet set = new HashSet();
		set.add(1);
		HashSet set1 = new HashSet();
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set.addAll(set1);
		System.out.println(set);
		
		
		
	}

}
