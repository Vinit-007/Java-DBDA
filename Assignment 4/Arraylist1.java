import java.util.*;
public class Arraylist1 {

	public static void main(String[] args) {
		
		ArrayList<String> movies = new ArrayList<>();
		
		movies.add("inception");
		movies.add("Interstellar");
		movies.add("inception");
		movies.add("parasite");
		movies.add("Demon Slayer");
		movies.add(0,"hitler");
		for(String i : movies) {
			System.out.println(i);
		}
		String idx = movies.get(2);
		System.out.println("at index : "+idx);
		movies.set(0, "interceptor");
		movies.remove(2);
		boolean isthere = movies.contains("inception");
		System.out.println(isthere);
		Collections.sort(movies);
		System.out.println(movies);
		Collections.reverse(movies);
		System.out.println(movies);
		movies.clear();
		System.out.println(movies);
		
		
		
		
		

	}

}
