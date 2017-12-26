package exercises.chapter6_reusing_classes.ex3;

public class Base {
    public Base() {
        System.out.println("parent constructor");
    }
}

class Derived extends Base {
    public static void main(String[] args) {
        new Derived();
    }
}
