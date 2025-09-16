//  Create a base class Animal with speak() method. Create subclasses Dog and Cat that  override speak() to print different sounds.

class Animal {
    void speak() {
        System.out.println("animal speaks something");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("dog barks");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("cat meow");
    }
}

public class Ques16 {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.speak();
        Animal c = new Cat();
        c.speak();

    }
}
