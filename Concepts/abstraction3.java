interface animal {
    void sound();

    void eat();
}

interface animal2 {
    void sleep();

    void hunt();
}

class dog implements animal, animal2 {
    public void sound() {
        System.out.println("barks");
    }

    public void eat() {
        System.out.println("eats bones");
    }

    public void sleep() {
        System.out.println("barely sleeps");
    }

    public void hunt() {
        System.out.println("hunts for cats");
    }
}

class cat implements animal {
    public void eat() {
        System.out.println("eats fishes ");
    }

    public void sound() {
        System.out.println("meows");
    }

}

public class abstraction3 {
    public static void main(String[] args) {
        animal a1 = new dog();
        animal2 a2 = new dog();
        animal a3 = new cat();
        a1.sound();
        a1.eat();
        a2.sleep();
        a2.hunt();
        a3.eat();
        a3.sound();
    }
}
