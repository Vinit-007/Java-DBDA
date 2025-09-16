import java.util.*;
public class hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map1 = new HashMap<>();
		map1.put(1, "aman");
		map1.put(2, "bhaman");
		map1.put(3, "chaman");
		map1.put(4, "daman");
		
		System.out.println(map1);
		
//		map1.containsKey(map1);
		int nos = map1.size();
		System.out.println(nos);
		
		Map<Integer,String> newMap = new HashMap<>(map1);
		System.out.println(newMap);
		
		map1.containsKey("aman");
		map1.containsKey(1);
		
		map1.clear();
		
		
		
		

	}

}
