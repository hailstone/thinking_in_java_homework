package exercises.chapter5_access_control.ex5.sub;

public class SubClass {
    public static void f1() {
        System.out.println("f1");
    }

    static void f2() {
        System.out.println("f2");
    }

    protected static void f3() {
        System.out.println("f3");
    }

    private static void f4() {
        System.out.println("f4");
    }
}

class Test {
    public static void main(String[] args) {
    }
}
