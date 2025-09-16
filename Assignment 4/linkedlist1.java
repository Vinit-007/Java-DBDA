import java.util.*;
public class linkedlist1 {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add("inception");
		names.add("Interstellar");
		names.add("inception");
		names.add("parasite");
		names.add("Demon Slayer");
		names.add(0,"hitler");
		for(String i : names) {
			System.out.println(i);
		}
		names.addLast("rahul");
		System.out.println("this is using for loop");
		for(int i =3;i<names.size();i++) {
			String str = names.get(i);
			System.out.println(str);
		}
		names.set(2, "hiranyaKshyap");
		
		names.addFirst("addie");
		names.addLast("maddie");
		names.addFirst("dharma");
		names.add(3,"namastes00");
		names.getFirst();
		names.getLast();
		names.removeFirst();
		names.removeLast();
		Collections.swap(names, 2, 3);
		
		LinkedList<String> names2 = new LinkedList<>();
		names2.add("surpanaka");
		names2.add("ravan");
		
		names.addAll(names2);
		System.out.print(names);
		
		Boolean st = names.contains(names2);
		System.out.println(st);
		
		ArrayList<String> arr2 = new ArrayList<>(names);
		System.out.println(arr2);
		
		names.containsAll(arr2);
		
		names.isEmpty();
		
		names.set(0,"newname");		
		
		
		
		
		
	}

}
