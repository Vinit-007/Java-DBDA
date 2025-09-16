// Create an interface Appliance with methods turnOn() and turnOff().
// Implement classes: Fan and Light.
// Test by switching on/off.

interface appliances {
    void turnOn();

    void turnOff();
}

class fan implements appliances {
    public void turnOn() {
        System.out.println("fan turned on");
    }

    public void turnOff() {
        System.out.println("fan turned off");
    }
}

class light implements appliances {
    public void turnOn() {
        System.out.println("lights turned on");
    }

    public void turnOff() {
        System.out.println("lights turned off");
    }
}

public class abstraction4 {
    public static void main(String args[]) {
        appliances f1 = new fan();
        appliances l1 = new light();
        f1.turnOn();
        f1.turnOff();
        l1.turnOn();
        l1.turnOff();

    }

}
