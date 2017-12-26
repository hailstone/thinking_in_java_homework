package exercises.chapter6_reusing_classes.ex7;

public class A {
    A(int i) {
        System.out.println("a");
    }
}

class B {
    B(int i) {
        System.out.println("b");
    }
}

class C extends A {
    C(int i) {
        super(i);
        System.out.println("c");
    }

    public static void main(String[] args) {
        new C(11);
    }
}
