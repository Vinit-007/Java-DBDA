class Animal {
    void makeSound() {
        System.out.println("Animal barks");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Barks");
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.makeSound();
    }
}