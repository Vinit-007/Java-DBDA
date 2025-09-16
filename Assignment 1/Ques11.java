class Employee {

    int sal;
    int numHrs;

    void getInfo(int sal, int numHrs) {
        this.sal = sal;
        this.numHrs = numHrs;
    }

    void AddSal() {
        if (sal < 500) {
            sal = sal + 10;
        }
    }

    void AddWork() {
        if (numHrs > 6) {
            sal = sal + 5;
        }
    }

    void print() {
        AddSal();
        AddWork();
        System.out.println("Final Salary = $" + sal);
    }
}

public class Ques11 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.getInfo(600, 7);
        e1.print();

        Employee e2 = new Employee();
        e2.getInfo(450, 5);
        e2.print();
    }
}
