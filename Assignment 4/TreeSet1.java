import java.util.*;
public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<String> fruits = new TreeSet<>();
		fruits.add("banana");
		fruits.add("kela");
		fruits.add("agashe");
		fruits.add("purkar");
		
		for(String s : fruits) {
			System.out.println(s);
		}
		
		TreeSet<String> fruit2 = new TreeSet<>();
		fruits.add("papita");
		fruits.add("peru");
		
		fruits.addAll(fruit2);
		System.out.println(fruits);
		
		NavigableSet<String> reversev = fruits.descendingSet();
		System.out.println(reversev);
		
		TreeSet<Integer> nos = new TreeSet<>();
		nos.add(4);
		nos.add(8);
		nos.add(9);
		nos.add(2);
		System.out.print(nos);
		
		for(int i : nos) {
			if(i < 7) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		

	}

}
