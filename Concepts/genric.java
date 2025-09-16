class MyGenerics<T> {
    T data;

    MyGenerics(T data) {
        this.data = data;
    }

    T getData() {
        return data;
    }

    void print() {
        System.out.println(data);
    }
}

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        return "roll: " + roll + ", name: " + name;
    }
}

public class genric {
    public static void main(String[] args) {
        MyGenerics<Integer> m1 = new MyGenerics<Integer>(100);
        int initalVal = m1.getData();
        System.out.println(initalVal);

        MyGenerics<String> m2 = new MyGenerics<String>("this is a string");
        String initalVal1 = m2.getData();
        System.out.println(initalVal1);

        Student s = new Student(1, "mohit");
        MyGenerics<Student> mg3 = new MyGenerics<Student>(s);
        mg3.print();
    }
}
