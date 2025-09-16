// 10. Create a Patient class with private attributes id, name, and disease. Provide methods  to set and get details and restrict modification of id once assigned.

class Patient {
    private final int id;
    private String name;
    private String disease;

    Patient(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    public int getId() {
        return id;
    }

    public String getname() {
        return name;
    }

    public String getdisease() {
        return disease;
    }

    public void setname() {
        this.name = name;
    }

    public void setdisease() {
        this.disease = disease;
    }

    void printInfo() {
        System.out.println(name + id + disease);
    }

}

public class Ques10 {
    public static void main(String[] args) {
        Patient p = new Patient(1, "aadi ", " paralysis ");
        p.printInfo();

    }
}
