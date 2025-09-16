// 25. Create an abstract class Appliance with abstract methods turnOn() and turnOff(). Implement these in Fan and Light classes.

abstract class Appliance {
    abstract void turnOn();

    abstract void turnOff();
}

class fan extends Appliance {
    void turnOn() {
        System.out.println("fan's turned on");
    }

    void turnOff() {
        System.out.println("fan's turned off");
    }
}

class Light extends Appliance {
    void turnOn() {
        System.out.println("Light's turned on");
    }

    void turnOff() {
        System.out.println("Light's turned off");
    }
}

public class Ques25 {
    public static void main(String[] args) {
        Appliance f = new fan();
        f.turnOn();
        Appliance l = new Light();
        l.turnOn();
        f.turnOff();
        l.turnOn();
    }
}
