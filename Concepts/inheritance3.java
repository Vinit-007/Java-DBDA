// multilevel inheritance 
// person -> Employee -> manager 
class person {
    String name;

    person(String name) {
        this.name = name;
    }
}

class Employee extends person {
    int id;

    Employee(String name, int id) {
        super(name);
        this.id = id;
    }
}

class Manager extends Employee {
    int bonus;

    Manager(String name, int id, int bonus) {
        super(name, id);
        this.bonus = bonus;
    }

    void displayInfo() {
        System.out.println(name + id + bonus);
    }
}

public class inheritance3 {
    public static void main(String[] args) {
        Manager m = new Manager("cr", 0, 7);
        m.displayInfo();

    }

}
