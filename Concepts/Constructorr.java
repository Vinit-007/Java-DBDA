class Class1 {
    Class1() {
        System.out.println("normal constructor");
    }

    Class1(int a) {
        this(); // this will call the constructor with no parameter
        System.out.println("single param constructor");
    }

    Class1(int a, int b) {
        this(a); // this will call the constructor with one parameter
        System.out.println("double param consstructor");
    }

}

// if we define a constuctor jvm won't provide us default constuctor
// default constructor has to be explicitly done constructor_name(){} to skip
// the error
// constructor chaining
class Constructorr {
    public static void main(String[] args) {
        Class1 c4 = new Class1(5, 6);
        // Class1 c1 = new Class1();
        // Class1 c2 = new Class1(10);
        // Class1 c3 = new Class1(10, 20);

    }
}