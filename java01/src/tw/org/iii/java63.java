package tw.org.iii;

import java.util.LinkedList;

public class java63 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add(0,"A");
		list.add(0,"b");
		list.add(0,"c");
		list.add(0,"b");//index <= list.size()
//		System.out.println(list.get(1));
		System.out.println(list);	
		list.remove("b");//�@���u�屼�@�ӥB��Ĥ@��
		System.out.println(list);
	}

}
