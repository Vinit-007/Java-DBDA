import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {

        HashSet<String> employeeSet = new HashSet<>();
        employeeSet.add("E101 - Alice");
        employeeSet.add("E102 - Bob");
        employeeSet.add("E103 - Charlie");

        System.out.println(employeeSet);

        System.out.println( employeeSet.size());

        String[] employeeArray = employeeSet.toArray(new String[0]);
        for (String emp : employeeArray) {
            System.out.println("   " + emp);
        }

        TreeSet<String> sortedSet = new TreeSet<>(employeeSet);
        System.out.println(sortedSet);

        ArrayList<String> employeeList = new ArrayList<>(employeeSet);
        System.out.println( employeeList);

        employeeSet.clear();
        System.out.println(employeeSet);
    }
}