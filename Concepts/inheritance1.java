//simple inheritance

class Manager {
    int id;
    String name;

    void displayInfo() {
        System.out.println("id is :" + id + "and the name is :" + name);
    }
}

class Employee extends Manager {
    int bonus;

    void ShowBonus() {
        System.out.println(bonus);
    }
}

public class inheritance1 {
    public static void main(String args[]) {
        Employee m = new Employee();
        m.id = 43;
        m.name = "John cena";
        m.bonus = 5000;

        m.displayInfo();
        m.ShowBonus();

    }

}
