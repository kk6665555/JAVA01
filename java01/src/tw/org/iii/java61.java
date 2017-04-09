package tw.org.iii;

import java.util.HashSet;
import java.util.Iterator;

public class java61 {
	public static void main(String[] args){
		HashSet set = new HashSet();
		
		
		int i1 =12;
		Integer i2 = new Integer(34);
		set.add(i2);
		set.add(i1);//i1=>aoto=boxing=> new Integer(i1);
		System.out.println(set);
		for(Object obj:set){
			System.out.println(obj);
		}
		
//		Iterator it = set.iterator();
//		while(it.hasNext()){//it有無下一個
//			Object obj =it.next();
//			Integer i =(Integer)obj;
//			System.out.println(i.floatValue());
//		}
//		Integer i1 = new Integer(12);
//		Integer i2 = new Integer("33");
//		int ii3 = 66;
//		Integer i3 = ii3;
//		System.out.println(i3.floatValue());
		//System.out.println(ii3.floatValue());//錯誤 ii3不是物件
		
	}
}
