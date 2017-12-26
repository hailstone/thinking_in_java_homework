package exercises.chapter6_reusing_classes.ex13;

public class A {
    public void go() {
        System.out.println("go");
    }

    public void go(int i) {
        System.out.println("gogo");
    }

    public void go(int i, int j) {
        System.out.println("gogogo");
    }

    public static void main(String[] args) {

    }
}

class B extends A {
    public void go(int i, int j, int k) {
        System.out.println("gogogogo");
    }

    public static void main(String[] args) {
        B b = new B();
        b.go();
        b.go(1);
        b.go(1, 2);
        b.go(1, 2, 3);
    }
}
