abstract class Animal { // abstract class
    private String name; // private variable

    Animal(String name) { // constructor
        this.name = name;
    }

    public void setName(String name) { // get mthd
        this.name = name;
    }

    public String getName() { // set mthd
        return name;
    }

    abstract void sound(); // abstract mthd

    public void eat() {
        System.out.println(name + " is eating ");
    }

}

class Dog extends Animal {
    public Dog(String name) { // calling constructor
        super(name);
    }

    public void sound() {
        System.out.println(getName() + "says woof"); // method overriding
    }

    public void play() {
        System.out.println(getName() + "is playing"); // method overloading
    }

    public void play(String toy) {
        System.out.println(getName() + "is playing");
    }
}

class cat extends Animal {

    public cat(String name) {
        super(name);
    }

    public void sound() {
        System.out.println(getName() + "says meow");
    }
}

public class oops {
    public static void main(String args[]) {

        Animal d1 = new Dog("arcanine");
        Animal c1 = new cat("mew");

        d1.sound();
        c1.sound();

        d1.setName("houndour");
        System.out.println("dogs new name : " + d1.getName());

        d1.eat();
        c1.eat();

        Dog d2 = new Dog("charlie");
        d2.play();
        d2.play("ball");

    }
}
