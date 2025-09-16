// 20. Create a Browser class with a method openWebsite(). Create subclasses Chrome and  Firefox that override openWebsite() with specific implementation details.
class Browser {
    void openWebsite() {
        System.out.println("this is a website");
    }
}

class Chrome extends Browser {
    void openWebsite() {
        System.out.println("this is chrome");
    }
}

class Firefox extends Browser {
    void openWebsite() {
        System.out.println("this is fireFox");
    }
}

public class Ques20 {
    public static void main(String[] args) {
        Browser c = new Chrome();
        c.openWebsite();
        Browser f = new Firefox();
        f.openWebsite();
    }
}
