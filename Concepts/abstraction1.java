abstract class animal {
    String name;

    animal(String name) {
        this.name = name;
    }

    abstract void sound();

    void sleep() {
        System.out.println(name + "is sleeping");
    }
}

class dog extends animal {
    dog(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + "is barking");
    }
}

class cat extends animal {
    cat(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + "is mewing");
    }
}

public class abstraction1 {
    public static void main(String[] args) {
        animal d = new dog("charlie");
        d.sound();
        d.sleep();

        animal c = new cat("tom");
        c.sleep();
        c.sound();

    }

}
