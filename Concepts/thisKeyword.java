class StoreStudents {
    int rollno;
    String name;

    public void SetKaro(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public void DisplayKaro() {
        System.out.println("Rollno: " + rollno + "  " + "Name: " + name);
    }

}

public class thisKeyword {
    public static void main(String args[]) {
        StoreStudents std1 = new StoreStudents();
        std1.SetKaro(4, "vinit");
        std1.DisplayKaro();
    }

}