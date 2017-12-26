package exercises.chapter6_reusing_classes.ex5;

public class C extends A {
    public B b = new B();

    public static void main(String[] args) {
        new C();
    }
}
