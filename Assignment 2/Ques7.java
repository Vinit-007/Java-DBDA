// 7. Write a Java program to create a Student class with private variables name and marks. Use getters to retrieve and setters to modify the values.

class Students {
    private String name;
    private int marks;

    Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class Ques7 {
    public static void main(String args[]) {
        Students s1 = new Students("vinit", 25);
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());
    }
}