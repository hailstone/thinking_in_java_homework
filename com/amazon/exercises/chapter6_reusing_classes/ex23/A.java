package exercises.chapter6_reusing_classes.ex23;

public class A {
    public static int i = 1;

    static {
        System.out.println("class loading");
    }

    public static void main(String[] args) {
//        new A();
//        new A();
        System.out.println(A.i);
    }
}
