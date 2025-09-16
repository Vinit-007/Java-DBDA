import java.util.*;
public class collection4 {

	public static void main(String[] args) {
		Map<String,Integer> map1 = new HashMap<>();
		map1.put("apple", 25);
		map1.put("banana", 15);
		map1.put("kela", 35);
		map1.put("agashe", 45);
		
		System.out.println(map1.get("kela"));
		
		map1.put("banana", 26);
		boolean b = map1.containsKey("kela");
		System.out.println(b);

	}

}
