interface vehicle {
    void start();

    void stop();
}

class car implements vehicle {
    public void start() {
        System.out.println("car starts");
    }

    public void stop() {
        System.out.println("car stops");
    }
}

class bike implements vehicle {
    public void start() {
        System.out.println("bike starts");
    }

    public void stop() {
        System.out.println("bike stops ");
    }
}

public class abstraction2 {
    public static void main(String args[]) {
        vehicle v = new car();
        v.start();
        v.stop();

        vehicle v2 = new bike();
        v2.start();
        v2.stop();
    }
}
