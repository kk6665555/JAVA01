package tw.org.iii;

import java.util.HashMap;
import java.util.Set;

public class java64 {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "mike");
		map.put("weight", "100");
		map.put("gender", true);
//		System.out.println(map.get("weight"));
		map.put("weight", "88");
//		System.out.println(map.get("weight"));
		System.out.println(map);
			for(String obj:map.keySet()){
				System.out.println(obj + "=" + map.get(obj));
			}
	}
}
