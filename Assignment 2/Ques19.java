// 19. Write a Java program where a Phone class has a method call(). Create subclasses  Smartphone and Landline that override call() differently.
class Phone {
    void call() {
        System.out.println("hello");
    }
}

class Smartphone extends Phone {
    void call() {
        System.out.println("kisko lagaya phone");
    }
}

class landline extends Phone {
    void call() {
        System.out.println("aapka kya naam hai hum se kya kaam hai !");
    }
}

public class Ques19 {
    public static void main(String[] args) {
        Phone s = new Smartphone();
        Phone l = new landline();
        s.call();
        l.call();
    }
}
