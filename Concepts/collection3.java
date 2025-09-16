import java.util.*;
public class collection3 {
	
	static void display(Collection <?> c) {
		for(Object ob:c) {
			System.out.println(ob);
		}
		
	}

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new LinkedHashSet<>();
		SortedSet<String> sortedFruits = new TreeSet<>();
		
		set1.add("aadi");
		set1.add("vesham");
		
		set2.add("parlia");
		set2.add("ment");
		
		display(set1);
		display(set2);
		
		boolean b = set1.containsAll(set2);
		System.out.println(b);
		
		
		sortedFruits.add("Mango");
        sortedFruits.add("Apple");
        sortedFruits.add("Orange");
        sortedFruits.add("Banana");
        sortedFruits.add("Grape");
        
        String firstElement = sortedFruits.first();
        System.out.println("First element: " + firstElement);
        
        display(sortedFruits);
        SortedSet<String> subSetView = sortedFruits.subSet("Banana", "Orange");
        System.out.println( subSetView);
		
		
		
		
		
		
		
		

	}

}
