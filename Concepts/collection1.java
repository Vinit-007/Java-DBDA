import java.util.*;

public class collection1 {
	public static void main (String args[]) {
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("banana");
		fruits.add("cherry");
		
		System.out.println(fruits);
		
		for(String str : fruits) {
			System.out.println(str);
		}
		
		fruits.add(1,"kiwi");
		
		System.out.println(fruits.get(1));
		
		fruits.set(3, "Mango");
		
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			
		}
		
		fruits.remove(2);
		
		
		
		ListIterator<String> lit = fruits.listIterator();
		while(lit.hasNext()) {
			String n =lit.next();
			System.out.println(n);
		}
		
		int size = fruits.size();
		
		System.out.println(size);
		
		fruits.clear();
		
		System.out.println(size);
		
		ArrayList<String> addmore = new ArrayList<>();
		
		addmore.add("orange");
		addmore.add("kela");
		
		fruits.addAll(0,addmore);
		System.out.println(fruits);
		
		int firstBananaIndex = fruits.indexOf("banana");
		System.out.println(firstBananaIndex);
		
		int lastBananaIndex = fruits.lastIndexOf("Banana");
		
		for(int i =0;i<fruits.size();i++) {
			String str = fruits.get(i);
			
			if("orange".equals(str)) {
				fruits.set(i,"agashe");
			}
		}
		System.out.println(fruits);
		
	}
}
