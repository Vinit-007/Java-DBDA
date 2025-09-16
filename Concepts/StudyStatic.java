class staticc {
    int instanceVar = 5;
    static int staticvar = 50;

    public static void calSal() {
        System.out.println("static method");
    }
}

public class StudyStatic {
    public static void main(String args[]) {
        staticc stat1 = new staticc();
        staticc stat2 = new staticc();
        staticc stat3 = new staticc();
        stat1.instanceVar = 6;
        System.out.println(stat1);

    }
}