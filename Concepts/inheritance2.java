// simple inheritance with this and super 
class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Manager extends Employee {
    int bonus;

    Manager(int id, String name, int bonus) {
        super(id, name);
        this.bonus = bonus;
    }

    void displayInfo() {
        System.out.println(id + name + bonus);
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        Manager m = new Manager(10, "chota bheem", 500);
        m.displayInfo();
    }

}
