class staticBlock {
    static {
        System.out.println("static block");
    }

    public static void main(String args[]) {
        System.out.println("main method"); // first static block is executed before execution of main method
    }
}
