class student {
    private int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("invalid age");
        }
    }

    public int getAge() {
        return age;
    }

}

public class encapsulation1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("kakashi");
        s1.setAge(100);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }

}
